package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="v1a")
public class V1a {



    @Id
    @Column(name ="col1")
    private String time;
    @Column(name ="col2")
    private String ga;
    @Column(name ="col3")
    private String na;
    @Column(name="col4")
    private String sa;

    public V1a(){}



    public V1a(String time, String ga, String na, String sa) {
        this.time = time;
        this.ga = ga;
        this.na = na;
        this.sa = sa;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGa() {
        return this.ga;
    }

    public void setGa(String ga) {
        this.ga = ga;
    }

    public String getNa() {
        return this.na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public String getSa() {
        return this.sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public V1a time(String time) {
        setTime(time);
        return this;
    }

    public V1a ga(String ga) {
        setGa(ga);
        return this;
    }

    public V1a na(String na) {
        setNa(na);
        return this;
    }

    public V1a sa(String sa) {
        setSa(sa);
        return this;
    }

    

}