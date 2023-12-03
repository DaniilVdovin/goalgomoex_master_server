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
       String msg = pythonStarter.Start(task_id,"data_markup.py",
                "--cmd_config",
                "--task_id "+task_id,
                "--scaler_path app/scalers/"+task_id+"/",
                "--neural_path app/neurals/"+task_id+"/",
                "--ticker SBER",
                "--timeframe 1D",
                "--start_date 2023-11-01",
                "--end_date 2023-11-26",
                "--count_points 6",
                "--extr_bar_count 10",
                "--respos_url localhost:8080"
                );
        return new dtoMessage("INFO",msg);
    }
}
