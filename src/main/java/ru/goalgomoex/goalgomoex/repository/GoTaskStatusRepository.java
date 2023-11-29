package ru.goalgomoex.goalgomoex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goalgomoex.goalgomoex.entitys.goTask;
import ru.goalgomoex.goalgomoex.entitys.goTaskStatus;

@Repository
public interface GoTaskStatusRepository extends JpaRepository<goTaskStatus, Long> {
}
