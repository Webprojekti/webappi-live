package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v5")
public class V5 {

    @Id
    @Column(name = "col1")
    private String yrbp;
    @Column(name = "col2")
    private String co2;




    public V5() {
    }


    public V5(String yrbp, String co2) {
        this.yrbp = yrbp;
        this.co2 = co2;
    }

    public String getYrbp() {
        return this.yrbp;
    }

    public void setYrbp(String yrbp) {
        this.yrbp = yrbp;
    }

    public String getCo2() {
        return this.co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public V5 yrbp(String yrbp) {
        setYrbp(yrbp);
        return this;
    }

    public V5 co2(String co2) {
        setCo2(co2);
        return this;
    }

}
