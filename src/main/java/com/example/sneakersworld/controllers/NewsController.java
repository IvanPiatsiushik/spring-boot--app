package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.News;
import com.example.sneakersworld.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String news(Model model){
        Iterable<News> news = newsRepository.findAll(Sort.by("id").descending());

        model.addAttribute("news",news);
        return "news";
    }
}
