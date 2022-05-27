package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.repository.HistoryRepository;
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

@Controller()
public class AddHistoryController {
    @Value("${upload.path}")
    private String uploadPath;
    @Autowired
    private final HistoryRepository historyrepository;
    public AddHistoryController(HistoryRepository historyrepository) {
        this.historyrepository = historyrepository;
    }

    @GetMapping("/add_history")
    public String history_add1(){
        return "add/add_history";
    }
    @PostMapping("/add_history")
    public String history_add(@RequestParam String name, @RequestParam String text,
                              @RequestParam("main_photo") MultipartFile file) throws IOException {
        File uploaDir = new File(uploadPath);
        if (!uploaDir.exists()) {
            uploaDir.mkdir();
        }
        String uuidFile= UUID.randomUUID().toString();
        String resultFilename = uuidFile + "." + file.getOriginalFilename();

        String finish_name =null;
        if (!file.isEmpty()) {
            file.transferTo(new File(uploadPath + "/" + resultFilename));
            finish_name= "/images" +"/"+ resultFilename;
        }

        History history = new History(name,text,finish_name);
        historyrepository.save(history);
        return "redirect:history";
    }
    @GetMapping("/history/page/{id}")
    public String page(@PathVariable Long id ,Model model){
        Optional<History> histories = historyrepository.findById(id);
        model.addAttribute("histories",histories);
        return "history/page";}
}
