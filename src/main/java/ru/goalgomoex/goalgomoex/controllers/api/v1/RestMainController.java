package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class RestMainController {
    @GetMapping("/version")
    public String getVersion(){
        return "v1";
    }
}
