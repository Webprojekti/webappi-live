package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v6")
public class V6 {

    @Id
    @Column(name = "col1")
    private String time;
    @Column(name = "col2")
    private String co2;




    public V6() {
    }

    public V6(String time, String co2) {
        this.time = time;
        this.co2 = co2;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCo2() {
        return this.co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public V6 time(String time) {
        setTime(time);
        return this;
    }

    public V6 co2(String co2) {
        setCo2(co2);
        return this;
    }
    

}
