package ru.goalgomoex.goalgomoex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PythonStarter {
    @Autowired private GoTaskService goTaskService;
    public String Start(long task_id,String file, String... params){
        ArrayList<String> UNIX = new ArrayList<>();
        UNIX.add("/bin/sh");
        UNIX.add("-c");
        UNIX.add("cd scripts/");
        UNIX.add("\n");
        UNIX.add("/bin/sh");
        UNIX.add("-c");
        UNIX.add("python3");
        UNIX.add(file);
        UNIX.addAll(List.of(params));
        UNIX.add("\n");
        try {
            Process process = Runtime.getRuntime().exec(UNIX.toArray(new String[0]));
            goTaskService.taskInProgress(task_id,process.pid());
            return "";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
