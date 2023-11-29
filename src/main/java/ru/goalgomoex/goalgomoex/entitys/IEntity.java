package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public interface IEntity{
    long getID();
    String getGUID();
    int getVersion();
}
