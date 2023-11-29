package ru.goalgomoex.goalgomoex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goalgomoex.goalgomoex.entitys.goTask;
import ru.goalgomoex.goalgomoex.entitys.goTaskStatus;
import ru.goalgomoex.goalgomoex.repository.GoTaskRepository;
import ru.goalgomoex.goalgomoex.repository.GoTaskStatusRepository;

import java.util.List;

@Service
public class GoTaskService {
    @Autowired private GoTaskRepository goTaskRepository;
    @Autowired private GoTaskStatusRepository goTaskStatusRepository;
    public List<goTask> taskList() {return goTaskRepository.findAll();}
    public List<goTaskStatus> statusTaskList() {return goTaskStatusRepository.findAll();}
    public goTask createOrUpdate(goTask object){
        if(object == null) return null;
        goTaskStatusRepository.save(object.getStatus());
        object.upVersion();
        return goTaskRepository.save(object);
    }
    public goTaskStatus getStatusById(Long id){
        return goTaskStatusRepository.findById(id).orElse(null);
    }
}
