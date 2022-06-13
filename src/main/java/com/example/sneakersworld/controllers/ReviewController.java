package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.News;
import com.example.sneakersworld.model.Review;
import com.example.sneakersworld.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.IntStream;

@Controller
public class ReviewController {
    @Value("${url.fromReview}")
    private String urlFromReview;
    @Autowired
    private ReviewRepository reviewRepository;
    @GetMapping("/review")
    public String review(Model model ,@RequestParam(value = "size",required = false,defaultValue = "4") Integer size,
                                      @RequestParam (value = "page",required = false,defaultValue = "0") Integer page){

//        String url = "http://localhost:3333/review";
        model.addAttribute("url",urlFromReview);
        model.addAttribute("page",page);


        Page<Review> reviewPage = (Page<Review>) reviewRepository.findAll((Pageable) PageRequest.of(page,size).withSort(Sort.by("id").descending()));

        model.addAttribute("news",reviewPage);
        model.addAttribute("numbers", IntStream.range(0,reviewPage.getTotalPages()).toArray());
        model.addAttribute("newsCurrentPageCount",reviewPage.getNumberOfElements());
        model.addAttribute("getNumber",reviewPage.getNumber());

        Iterable<Review> reviews = reviewRepository.findAll(Sort.by("id").descending());
        model.addAttribute("review",reviews);
        return "review";
    }
}
