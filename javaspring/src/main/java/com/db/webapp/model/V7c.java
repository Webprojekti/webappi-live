package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v7c")
public class V7c {

    @Id
    @Column(name = "col1")
    private String timeyrbp;
    @Column(name = "col2")
    private String carbondioxideppm;
    @Column(name = "col3")
    private String onesdppm;


    public V7c() {
    }

    public V7c(String timeyrbp, String carbondioxideppm, String onesdppm) {
        this.timeyrbp = timeyrbp;
        this.carbondioxideppm = carbondioxideppm;
        this.onesdppm = onesdppm;
    }

    public String getTimeyrbp() {
        return this.timeyrbp;
    }

    public void setTimeyrbp(String timeyrbp) {
        this.timeyrbp = timeyrbp;
    }

    public String getCarbondioxideppm() {
        return this.carbondioxideppm;
    }

    public void setCarbondioxideppm(String carbondioxideppm) {
        this.carbondioxideppm = carbondioxideppm;
    }

    public String getOnesdppm() {
        return this.onesdppm;
    }

    public void setOnesdppm(String onesdppm) {
        this.onesdppm = onesdppm;
    }

    public V7c timeyrbp(String timeyrbp) {
        setTimeyrbp(timeyrbp);
        return this;
    }

    public V7c carbondioxideppm(String carbondioxideppm) {
        setCarbondioxideppm(carbondioxideppm);
        return this;
    }

    public V7c onesdppm(String onesdppm) {
        setOnesdppm(onesdppm);
        return this;
    }


}