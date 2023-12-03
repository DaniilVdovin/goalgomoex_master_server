package ru.goalgomoex.goalgomoex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class IOTaskJsonService {
    public String Read(long task_id){
        try {
            return new String(Files.readAllBytes(Path.of(task_id + ".json")));
        } catch (IOException e) {
            return null;
        }
    }
    public boolean Write(long task_id,String body){
        try {
            File file = new File(task_id+".json");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getPath()));
            writer.write(body);
            writer.close();
            System.out.println(file.getAbsolutePath());
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
