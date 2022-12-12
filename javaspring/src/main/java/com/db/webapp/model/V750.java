package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v750")
public class V750 {

    @Id
    @Column(name = "time")
    private String time;
    @Column(name = "fifty")
    private String fifty;

        public V750() {
        }
    
   

    public V750(String time, String fifty) {
        this.time = time;
        this.fifty = fifty;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFifty() {
        return this.fifty;
    }

    public void setFifty(String fifty) {
        this.fifty = fifty;
    }

    public V750 time(String time) {
        setTime(time);
        return this;
    }

    public V750 fifty(String fifty) {
        setFifty(fifty);
        return this;
    }
            
}