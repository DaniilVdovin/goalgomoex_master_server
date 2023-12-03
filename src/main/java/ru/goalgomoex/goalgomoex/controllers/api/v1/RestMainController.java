package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.goalgomoex.goalgomoex.entitys.goScriptConfig;
import ru.goalgomoex.goalgomoex.services.PythonStarter;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;

import java.util.Date;

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
        goScriptConfig config = new goScriptConfig()
                .setTask_id(task_id)
                .setScaler_path("app/scalers/"+task_id+"/")
                .setNeural_path("app/neurals/"+task_id+"/")
                .setTicker("SBER")
                .setTimeframe("1D")
                .setStart_date(new Date("2023-11-01"))
                .setEnd_date(new Date("2023-11-01"))
                .setCount_points(6)
                .setExtr_bar_count(10)
                .setRespos_url("localhost:8080");
        String msg = pythonStarter.Start(task_id,"data_markup.py",config);
        return new dtoMessage("INFO",msg);
    }
}
