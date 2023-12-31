package com.example.demovacjava.controllers;

import com.example.demovacjava.models.Input;
import com.example.demovacjava.models.OutputDb;
import com.example.demovacjava.repositories.OutputDBRepository;
import com.example.demovacjava.services.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ResultController {
    private final Output output;
    @Autowired
    private OutputDBRepository repository;

    public ResultController(Output output) {
        this.output = output;
    }
    @PostMapping("/index")
    public String publishResult(@RequestParam int year, @RequestParam int month, @RequestParam int day, Model model) {
        Input input = new Input(day, month, year);
        String result = output.result(input);
        model.addAttribute("result", result);
        OutputDb db = new OutputDb(result);
        repository.save(db);
        return "/result";
    }
}
