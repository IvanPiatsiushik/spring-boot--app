package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.News;
import com.example.sneakersworld.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.stream.IntStream;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String news(Model model,
                       @RequestParam (value = "size",required = false,defaultValue = "10") Integer size,
                       @RequestParam (value = "page",required = false,defaultValue = "0") Integer page)
    {

        String url = "http://localhost:3333/news";
        model.addAttribute("url",url);
        model.addAttribute("page",page);


        Page<News> newsPage = (Page<News>) newsRepository.findAll((Pageable) PageRequest.of(page,size).withSort(Sort.by("id").descending()));

        model.addAttribute("news",newsPage);
        model.addAttribute("numbers", IntStream.range(0,newsPage.getTotalPages()).toArray());
        model.addAttribute("newsCurrentPageCount",newsPage.getNumberOfElements());
        model.addAttribute("getNumber",newsPage.getNumber());

//        model.addAttribute("newsAllCount",newsPage.getTotalElements());
//        model.addAttribute("size",size);
//        Iterable<News> news = newsRepository.findFirst10ByOrderByIdDesc();
//        Iterable<News> news = newsRepository.findAll(Sort.by("id").descending());

        return "news";
    }
}
