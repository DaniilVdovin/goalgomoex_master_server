package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "go_tasks")
public class goTask implements IEntity{
    @Id
    @GeneratedValue
    private long ID;
    private String GUID;
    private int version;
    private String processID;
    @ManyToOne(targetEntity = goTaskStatus.class)
    private goTaskStatus status;

    public goTask() {
    }

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

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public goTaskStatus getStatus() {
        return status;
    }

    public void setStatus(goTaskStatus status) {
        this.status = status;
    }

    @Override
    public void upVersion() {
        version++;
    }
}
