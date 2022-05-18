package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller()
public class AddHistoryController {
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
    public String history_add(@RequestParam String historyPage,@RequestParam String name, @RequestParam String text , @RequestParam String urlPicture,@RequestParam String picture){
        History history = new History(name,historyPage,urlPicture,picture,text);
        historyrepository.save(history);
        return "redirect:history";
    }
    @GetMapping("/history/page/{id}")
    public String page(@PathVariable Long id ,Model model){
        Optional<History> histories = historyrepository.findById(id);
        model.addAttribute("histories",histories);
        return "history/page";}
}
