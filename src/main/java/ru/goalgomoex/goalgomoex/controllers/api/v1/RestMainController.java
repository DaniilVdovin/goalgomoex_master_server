package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoVersion;

@RestController()
public class RestMainController {
    @GetMapping("/version")
    public dtoVersion getVersion(){
        return new dtoVersion("v1");
    }
}
