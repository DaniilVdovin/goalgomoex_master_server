package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "go_tasks")
public class goTask implements IEntity{
    @Id
    @GeneratedValue
    private long ID;
    private String GUID;
    private int version;

    @Override
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
    @Override
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
