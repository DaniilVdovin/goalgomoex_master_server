package ru.goalgomoex.goalgomoex.controllers;

import jakarta.annotation.security.PermitAll;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String welcome(){
        return "redirect:/api/v1/version";
    }
}
