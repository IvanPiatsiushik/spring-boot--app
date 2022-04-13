package com.example.sneakersworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homePage(){
        return"/home";
    }
    @GetMapping("/news")
    public String news(){
        return "/news";
    }
}
