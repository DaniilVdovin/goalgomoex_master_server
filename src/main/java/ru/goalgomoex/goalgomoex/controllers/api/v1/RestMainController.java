package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.goalgomoex.goalgomoex.core.PythonStarter;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;
@RestController()
public class RestMainController {
    @GetMapping("/version")
    public dtoMessage getVersion(){
        return new dtoMessage("INFO","v1");
    }
    @GetMapping("/start")
    public dtoMessage start(@RequestParam("script") String script){
        String msg = PythonStarter.Start(script+".py");
        return new dtoMessage(msg!=null?"INFO":"ERROR","out:"+msg);
    }
}
