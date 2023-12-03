package ru.goalgomoex.goalgomoex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goalgomoex.goalgomoex.entitys.goScriptConfig;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PythonStarter {
    @Autowired private GoTaskService goTaskService;
    public String Start(long task_id,String file, goScriptConfig config){
        return Start(task_id,file,config.toParams());
    }
    public String Start(long task_id,String file, String... params){
        //if(goTaskService.getTask(task_id).getStatus() != 0) return "CANT";
        ArrayList<String> UNIX = new ArrayList<>();
        UNIX.add("/bin/sh");
        UNIX.add("/var/opt/goalgomoex/starter.sh");
        UNIX.add(file);
        UNIX.addAll(List.of(params));
        try {
            Process process = Runtime.getRuntime().exec(String.join(" ",UNIX));
            System.out.println(String.join(" ",UNIX));
            goTaskService.taskInProgress(task_id,process.pid());
            return "Start ("+process.pid()+") : "+String.join(" ",UNIX);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
}
