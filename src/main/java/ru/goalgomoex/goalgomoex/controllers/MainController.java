package ru.goalgomoex.goalgomoex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String init(){
        return "1";
    }
}
