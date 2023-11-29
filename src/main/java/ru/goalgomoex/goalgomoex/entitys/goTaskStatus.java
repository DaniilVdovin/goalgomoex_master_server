package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class goTaskStatus implements IEntity{
    @Id
    @GeneratedValue
    private long ID;
    private String GUID;
    private int version;
    private String Name;

    @Override
    public long getID() {
        return ID;
    }

    @Override
    public String getGUID() {
        return GUID;
    }

    @Override
    public int getVersion() {
        return version;
    }
}
