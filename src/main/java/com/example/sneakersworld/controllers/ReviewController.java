package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.Review;
import com.example.sneakersworld.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;
    @GetMapping("/review")
    public String review(Model model){
        Iterable<Review> reviews = reviewRepository.findAll(Sort.by("id").descending());
        model.addAttribute("review",reviews);
        return "review";
    }
}
