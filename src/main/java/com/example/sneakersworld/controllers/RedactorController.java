package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.Review;
import com.example.sneakersworld.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RedactorController {
    @Autowired
    private ReviewRepository reviewRepository;
    @GetMapping("/redactor")
    public String redactor(Model model){
        List<Review> reviews =  reviewRepository.findAll();
        model.addAttribute("review_redactor" , reviews);
        return "redactor";
    }

}
