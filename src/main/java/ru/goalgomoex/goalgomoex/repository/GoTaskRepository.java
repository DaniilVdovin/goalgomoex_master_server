package ru.goalgomoex.goalgomoex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goalgomoex.goalgomoex.entitys.goTask;

@Repository
public abstract class GoTaskRepository implements JpaRepository<goTask, Long> {
}
