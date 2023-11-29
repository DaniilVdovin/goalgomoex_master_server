package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class goTaskStatus implements IEntity{
    @Id
    @GeneratedValue
    private long ID;
    private int version;
    private String Name;

    public goTaskStatus() {
    }

    public goTaskStatus(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
        version = 1;
    }

    @Override
    public long getID() {
        return ID;
    }

    @Override
    public String getGUID() {
        return null;
    }

    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void upVersion() {
        version++;
    }
}
