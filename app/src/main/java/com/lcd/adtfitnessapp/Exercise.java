package com.lcd.adtfitnessapp;

import java.io.Serializable;

public class Exercise implements Serializable {
    private int resourceID;
    private String name;
    private String time;

    public Exercise(int resourceID, String name, String time) {
        this.resourceID = resourceID;
        this.name = name;
        this.time = time;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
