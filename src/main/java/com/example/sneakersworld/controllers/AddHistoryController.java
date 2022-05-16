package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller()
public class AddHistoryController {
    @Autowired
    private final HistoryRepository historyrepository;

    public AddHistoryController(HistoryRepository historyrepository) {
        this.historyrepository = historyrepository;
    }

    @GetMapping("/history")
    public String history(Model model){
        Iterable<History> history = historyrepository.findAll(Sort.by("id").descending());
        model.addAttribute("history",history);
        return "history/history";
    }
    @PostMapping
    @GetMapping("/test1")
    public String test1(Model model){
        Optional<History> histories = historyrepository.findById(1L);
        model.addAttribute("histories",histories);
        return "history/test";}
    @GetMapping("/test2")
    public String test2(Model model){
        Optional<History> histories = historyrepository.findById(2L);
        model.addAttribute("histories",histories);
        return "history/test";}
    @GetMapping("/test3")
    public String test3(Model model){
        Optional<History> histories = historyrepository.findById(3L);
        model.addAttribute("histories",histories);
        return "history/test";}
    @GetMapping("/test4")
    public String test4(Model model){
        Optional<History> histories = historyrepository.findById(4L);
        model.addAttribute("histories",histories);
        return "history/test";}
}
