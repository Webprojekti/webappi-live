package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v2")
public class V2 {

    @Id
    @Column(name = "col1")
    private String time;
    @Column(name = "col2")
    private String t;




    public V2() {
    }

    public V2(String time, String t) {
        this.time = time;
        this.t = t;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getT() {
        return this.t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public V2 time(String time) {
        setTime(time);
        return this;
    }

    public V2 t(String t) {
        setT(t);
        return this;
    }


    

}
