package ru.goalgomoex.goalgomoex.entitys.dto;

import java.util.Date;

public class dtoVersion implements IDTOEntity {
    private final String version;
    private final Date serverDateTime;
    public dtoVersion(String version) {
        this.version = version;
        this.serverDateTime = new Date();
    }
    public String getVersion() {
        return version;
    }
    public Date getServerDateTime() {
        return serverDateTime;
    }
}
