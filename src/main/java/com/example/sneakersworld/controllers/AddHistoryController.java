package com.example.sneakersworld.controllers;

import com.example.sneakersworld.model.History;
import com.example.sneakersworld.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/page1")
    public String page1(Model model){
        Optional<History> histories = historyrepository.findById(1L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page2")
    public String page2(Model model){
        Optional<History> histories = historyrepository.findById(2L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page3")
    public String page3(Model model){
        Optional<History> histories = historyrepository.findById(3L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page4")
    public String page4(Model model){
        Optional<History> histories = historyrepository.findById(4L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page5")
    public String page5(Model model){
        Optional<History> histories = historyrepository.findById(5L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page6")
    public String page6(Model model){
        Optional<History> histories = historyrepository.findById(6L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page7")
    public String page7(Model model){
        Optional<History> histories = historyrepository.findById(7L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page8")
    public String page8(Model model){
        Optional<History> histories = historyrepository.findById(8L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page9")
    public String page9(Model model){
        Optional<History> histories = historyrepository.findById(9L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page10")
    public String page10(Model model){
        Optional<History> histories = historyrepository.findById(10L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page11")
    public String test11(Model model){
        Optional<History> histories = historyrepository.findById(11L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page12")
    public String test12(Model model){
        Optional<History> histories = historyrepository.findById(12L);
        model.addAttribute("histories",histories);
        return "history/page";}
    @GetMapping("/page13")
    public String test13(Model model){
        Optional<History> histories = historyrepository.findById(13L);
        model.addAttribute("histories",histories);
        return "history/page";}
}
