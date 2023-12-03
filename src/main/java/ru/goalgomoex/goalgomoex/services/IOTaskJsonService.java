package ru.goalgomoex.goalgomoex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

@Service
public class IOTaskJsonService {
    @Autowired private ResourceLoader resourceLoader;
    public String Read(long task_id){
        Resource resource = resourceLoader.getResource("classpath:results/"+task_id+".json");
        try {
            File file = resource.getFile();
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            return null;
        }
    }
}
