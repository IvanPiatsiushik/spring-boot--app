package com.example.sneakersworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/article1")
    public String article1(){
        return "articles/article1";
    }
    @GetMapping("/article2")
    public String article2(){
        return "articles/article2";
    }
    @GetMapping("/article3")
    public String article3(){
        return "articles/article3";
    }
    @GetMapping("/article4")
    public String article4(){
        return "articles/article4";
    }
    @GetMapping("/article5")
    public String article5(){
        return "articles/article5";
    }
}
