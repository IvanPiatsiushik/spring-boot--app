package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {
    @Autowired
    private final HistoryRepository historyrepository;

    public HistoryController(HistoryRepository historyrepository) {
        this.historyrepository = historyrepository;
    }
    @GetMapping("/history")
    public String history(Model model){
        Iterable<History> history = historyrepository.findAll(Sort.by("id").descending());
        model.addAttribute("history",history);
        return "history/history";
    }
}
