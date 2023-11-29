package ru.goalgomoex.goalgomoex.controllers;

import jakarta.annotation.security.PermitAll;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    @PermitAll()
    public String init(){
        return "1";
    }
}
