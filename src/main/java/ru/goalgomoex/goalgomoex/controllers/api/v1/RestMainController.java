package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.goalgomoex.goalgomoex.core.GoTools;
import ru.goalgomoex.goalgomoex.core.PythonStarter;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;
import ru.goalgomoex.goalgomoex.entitys.goTask;
import ru.goalgomoex.goalgomoex.entitys.goTaskStatus;
import ru.goalgomoex.goalgomoex.services.GoTaskService;

import java.util.List;

@RestController()
public class RestMainController {
    @Autowired private GoTaskService goTaskService;
    @GetMapping("/version")
    public dtoMessage getVersion(){
        return new dtoMessage("INFO","v1");
    }
    @GetMapping("/start")
    public dtoMessage start(@RequestParam("script") String script){
        String msg = PythonStarter.Start(script+".py");
        return new dtoMessage(msg!=null?"INFO":"ERROR","out:"+msg);
    }
    @GetMapping("/task/add")
    public goTask goTaskAdd(){
        goTask task = new goTask();
        task.setStatus(new goTaskStatus(1,"CREATED"));
        task.setProcessID("0x012123");
        task.setGUID(GoTools.GenerateGUID());
        task.setVersion(0);
        return goTaskService.createOrUpdate(task);
    }
    @GetMapping("/task/list")
    public List<goTask> goTaskList(){
        return goTaskService.taskList();
    }

    @PostMapping("task/complied")
    public void TaskComplied(){

    }
}
