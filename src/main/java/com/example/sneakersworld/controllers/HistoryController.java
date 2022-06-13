package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.model.News;
import com.example.sneakersworld.repository.HistoryRepository;
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
public class HistoryController {
    @Value("${url.fromHistory}")
    private String urlFromHistory;
    @Autowired
    private final HistoryRepository historyrepository;

    public HistoryController(HistoryRepository historyrepository) {
        this.historyrepository = historyrepository;
    }
    @GetMapping("/history")
    public String history(Model model , @RequestParam(value = "size",required = false,defaultValue = "10") Integer size,
                                        @RequestParam (value = "page",required = false,defaultValue = "0") Integer page){

        model.addAttribute("url",urlFromHistory);
        model.addAttribute("page",page);

        Page<History> historyPage = (Page<History>) historyrepository.findAll((Pageable) PageRequest.of(page,size).withSort(Sort.by("id").descending()));

        model.addAttribute("history",historyPage);
        model.addAttribute("numbers", IntStream.range(0,historyPage.getTotalPages()).toArray());
        model.addAttribute("getNumber",historyPage.getNumber());







//        Iterable<History> history = historyrepository.findFirst10ByOrderByIdDesc();
//        Iterable<History> history = historyrepository.findAll(Sort.by("id").descending());
//        model.addAttribute("history",history);
        return "history/history";
    }
}
