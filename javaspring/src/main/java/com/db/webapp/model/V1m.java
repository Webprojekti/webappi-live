package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="v1m")
public class V1m {



    @Id
    @Column(name ="col1")
    private String time;
    @Column(name ="col2")
    private String gm;
    @Column(name ="col3")
    private String nm;
    @Column(name="col4")
    private String sm;

    public V1m(){}


    public V1m(String time, String gm, String nm, String sm) {
        this.time = time;
        this.gm = gm;
        this.nm = nm;
        this.sm = sm;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGm() {
        return this.gm;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }

    public String getNm() {
        return this.nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getSm() {
        return this.sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public V1m time(String time) {
        setTime(time);
        return this;
    }

    public V1m gm(String gm) {
        setGm(gm);
        return this;
    }

    public V1m nm(String nm) {
        setNm(nm);
        return this;
    }

    public V1m sm(String sm) {
        setSm(sm);
        return this;
    }


}