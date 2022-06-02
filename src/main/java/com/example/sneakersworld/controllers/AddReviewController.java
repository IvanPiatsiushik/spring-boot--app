package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.Review;
import com.example.sneakersworld.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Controller
public class AddReviewController {
    @Value("${upload.path}")
    private String uploadPath;
    @Autowired
    private ReviewRepository reviewRepository;
    @GetMapping("/add_review")
    public String addReview(){
        return "add/add_review";
    }
    @PostMapping("/add_review")
    public String add_review (@RequestParam String name , @RequestParam String text_full,
                            @RequestParam("filename1") MultipartFile file1,
                            @RequestParam("filename2") MultipartFile file2,
                            @RequestParam("filename3") MultipartFile file3,
                            @RequestParam("filename4") MultipartFile file4,
                            @RequestParam("filename5") MultipartFile file5) throws IOException {

        File uploaDir = new File(uploadPath);
    if (!uploaDir.exists()) {
            uploaDir.mkdir();
        }
        String uuidFile= UUID.randomUUID().toString();

        String resultFilename1 = uuidFile + "." + file1.getOriginalFilename();
        String resultFilename2 = uuidFile+ "." + file2.getOriginalFilename();
        String resultFilename3 = uuidFile + "." + file3.getOriginalFilename();
        String resultFilename4 = uuidFile+ "." + file4.getOriginalFilename();
        String resultFilename5 = uuidFile+ "." + file5.getOriginalFilename();

        String finish1 =null;
        if (!file1.isEmpty()) {
            file1.transferTo(new File(uploadPath + "/" + resultFilename1));
            finish1= "/images" +"/"+ resultFilename1;
        }
        String finish2 =null;
        if (!file2.isEmpty()) {
            file2.transferTo(new File(uploadPath + "/" + resultFilename2));
            finish2= "/images" +"/"+ resultFilename2;
        }
        String finish3 =null;
        if (!file3.isEmpty()) {
            file3.transferTo(new File(uploadPath + "/" + resultFilename3));
            finish3= "/images" +"/"+ resultFilename3;
        }
        String finish4 =null;
        if (!file4.isEmpty()) {
            file4.transferTo(new File(uploadPath + "/" + resultFilename4));
            finish4= "/images" +"/"+ resultFilename4;
        }
        String finish5 =null;
        if (!file5.isEmpty()) {
            file5.transferTo(new File(uploadPath + "/" + resultFilename5));
            finish5= "/images" +"/"+ resultFilename5;
        }
        Review review = new Review(name, text_full, finish1,finish2,finish3,finish4,finish5);
        reviewRepository.save(review);

        return "redirect:review";
    }
    @GetMapping("/review/pages/{id}")
    public String page(@PathVariable Long id , Model model){
        Optional<Review> review = reviewRepository.findById(id);
        model.addAttribute("review1",review);
        return "pegases";}

}
