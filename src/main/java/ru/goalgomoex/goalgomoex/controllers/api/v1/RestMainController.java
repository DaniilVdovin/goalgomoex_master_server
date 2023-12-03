package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.goalgomoex.goalgomoex.services.PythonStarter;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;

@RestController
@RequestMapping("/api/v1")
public class RestMainController{
    @Autowired protected PythonStarter pythonStarter;
    @GetMapping("/")
    public dtoMessage getTitle(){
        return new dtoMessage("INFO","GOALGOMOEX");
    }
    @GetMapping("/version")
    public dtoMessage getVersion(){
        return new dtoMessage("INFO","v1");
    }
    @GetMapping("/test/start")
    public dtoMessage start(@RequestParam("task_id") long task_id){
        String msg = pythonStarter.Start(task_id,"calc_signals.py");
        return new dtoMessage(msg!=null?"INFO":"ERROR","out:"+msg);
    }
}
