package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.News;
import com.example.sneakersworld.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import static java.lang.String.valueOf;

@Controller
public class AddNewsController {
    @Value("${upload.path}")
    private String uploadPath;
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/add_news")
    public String add(){
        return "add/add_news";
    }

    @PostMapping ("/add_news")
    public String add_news(@RequestParam String name, @RequestParam String contain,Model model,
                           @RequestParam("file")MultipartFile file1 ,@RequestParam ("filename2")MultipartFile file2 ,
                           @RequestParam("filename3")MultipartFile file3 ,@RequestParam ("filename4")MultipartFile file4 ,
                           @RequestParam("filename5")MultipartFile file5 ,@RequestParam ("filename6")MultipartFile file6 ,
                           @RequestParam("filename7")MultipartFile file7 ,@RequestParam ("filename8")MultipartFile file8 ,
                           @RequestParam("filename9")MultipartFile file9 ,@RequestParam ("filename10")MultipartFile file10
                                                                                        ) throws IOException {
//        if(!file1.isEmpty()) {
        File uploaDir = new File(uploadPath);
            if (!uploaDir.exists()) {
                uploaDir.mkdir();
            }
//        }
        String uuidFile= UUID.randomUUID().toString();

        String resultFilename1 = uuidFile + "." + file1.getOriginalFilename();
        String resultFilename2 = uuidFile+ "." + file2.getOriginalFilename();
        String resultFilename3 = uuidFile + "." + file3.getOriginalFilename();
        String resultFilename4 = uuidFile+ "." + file4.getOriginalFilename();
        String resultFilename5 = uuidFile+ "." + file5.getOriginalFilename();
        String resultFilename6 = uuidFile+ "." + file6.getOriginalFilename();
        String resultFilename7 = uuidFile+ "." + file7.getOriginalFilename();
        String resultFilename8 = uuidFile+ "." + file8.getOriginalFilename();
        String resultFilename9 = uuidFile+ "." + file9.getOriginalFilename();
        String resultFilename10= uuidFile + "." + file10.getOriginalFilename();

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
        String finish6 =null;
        if (!file6.isEmpty()) {
            file6.transferTo(new File(uploadPath + "/" + resultFilename6));
            finish6= "/images" +"/"+ resultFilename6;
        }
        String finish7 =null;
        if (!file7.isEmpty()) {
            file7.transferTo(new File(uploadPath + "/" + resultFilename7));
            finish7= "/images" +"/"+ resultFilename7;
        }
        String finish8 =null;
        if (!file8.isEmpty()) {
            file8.transferTo(new File(uploadPath + "/" + resultFilename8));
            finish8= "/images" +"/"+ resultFilename8;
        }
        String finish9 =null;
        if (!file9.isEmpty()) {
            file9.transferTo(new File(uploadPath + "/" + resultFilename9));
            finish9= "/images" +"/"+ resultFilename9;
        }
        String finish10 =null;
        if (!file10.isEmpty()) {
            file10.transferTo(new File(uploadPath + "/" + resultFilename10));
            finish10= "/images" +"/"+ resultFilename10;
        }

        News news = new News(name, contain, finish1,finish2,finish3,finish4,finish5,finish6,finish7,finish8,finish9,finish10);
        newsRepository.save(news);

        return "redirect:news";
    }
    @GetMapping("/news/pages/{id}")
    public String page(@PathVariable Long id , Model model){
        Optional<News> news = newsRepository.findById(id);
        model.addAttribute("news1",news);
        return "pages";}
}
