package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.News;
import com.example.sneakersworld.repository.NewsRepository;
import org.apache.logging.log4j.util.PropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;
import java.util.Comparator;

@Controller
public class AddNewsController {

    @Autowired
    private NewsRepository newsRepository;
    @GetMapping("/add")
    public String news(Model model){
    Iterable<News> news = newsRepository.findAll(Sort.by("id").descending());

    model.addAttribute("news",news);
        return "add";
    }
    @PostMapping ("/add")
    public String addNews(@RequestParam String name,@RequestParam String contain ,@RequestParam String urlPicture, Model model){
        News news = new News(name,contain,urlPicture);
        newsRepository.save(news);

        Iterable<News> news1 = newsRepository.findAll(Sort.by("id").descending());
        model.addAttribute("news",news1);
        return "add";
    }

}
