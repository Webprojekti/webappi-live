package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v7ppm")
public class V7ppm {

    @Id
    @Column(name = "time")
    private String time;
    @Column(name = "ppm")
    private String ppm;
   


    public V7ppm() {
    }

    public V7ppm(String time, String ppm) {
        this.time = time;
        this.ppm = ppm;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPpm() {
        return this.ppm;
    }

    public void setPpm(String ppm) {
        this.ppm = ppm;
    }

    public V7ppm time(String time) {
        setTime(time);
        return this;
    }

    public V7ppm ppm(String ppm) {
        setPpm(ppm);
        return this;
    }

    
}