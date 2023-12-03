package ru.goalgomoex.goalgomoex.controllers.api.v1;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.goalgomoex.goalgomoex.core.GoTools;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;
import ru.goalgomoex.goalgomoex.entitys.dto.task.dtoTaskOut;
import ru.goalgomoex.goalgomoex.entitys.goTask;
import ru.goalgomoex.goalgomoex.services.GoTaskService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class RestTaskController {
    @Autowired
    private GoTaskService goTaskService;
    @GetMapping("/add")
    public goTask goTaskAdd(){
        goTask task = new goTask();
        task.setStatus(0);
        task.setStart_time(new Date());
        task.setGUID(GoTools.GenerateGUID());
        task.setVersion(0);
        return goTaskService.createOrUpdate(task);
    }
    @GetMapping("/get")
    public goTask getGoTask(@RequestParam("task_id") long task_id){
        return goTaskService.getTask(task_id);
    }
    @GetMapping("/close")
    public dtoMessage TaskClose(@RequestParam("task_id") long task_id){
        goTaskService.taskCompliedWithError(task_id);
        return new dtoMessage("INFO","Task %d Close".formatted(task_id));
    }
    @PostMapping("/complied")
    public dtoMessage TaskComplied(@RequestBody String taskAsJson){
        Gson gson = new Gson();
        dtoTaskOut task = gson.fromJson(taskAsJson,dtoTaskOut.class);
        goTaskService.taskComplied(task.getTask_id());

        return new dtoMessage("INFO","Task %d Complied".formatted(task.getTask_id()));
    }
}
