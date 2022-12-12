package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v7t")
public class V7t {

    @Id
    @Column(name = "col1")
    private String timeyrbp;
    @Column(name = "col2")
    private String antarctictempchange;
    @Column(name = "col3")
    private String antarctictermpuncertainty;
        public V7t() {
        }
    
        public V7t(String timeyrbp, String antarctictempchange, String antarctictermpuncertainty) {
            this.timeyrbp = timeyrbp;
            this.antarctictempchange = antarctictempchange;
            this.antarctictermpuncertainty = antarctictermpuncertainty;
        }
    
        public String getTimeyrbp() {
            return this.timeyrbp;
        }
    
        public void setTimeyrbp(String timeyrbp) {
            this.timeyrbp = timeyrbp;
        }
    
        public String getAntarctictempchange() {
            return this.antarctictempchange;
        }
    
        public void setAntarctictempchange(String antarctictempchange) {
            this.antarctictempchange = antarctictempchange;
        }
    
        public String getAntarctictermpuncertainty() {
            return this.antarctictermpuncertainty;
        }
    
        public void setAntarctictermpuncertainty(String antarctictermpuncertainty) {
            this.antarctictermpuncertainty = antarctictermpuncertainty;
        }
    
        public V7t timeyrbp(String timeyrbp) {
            setTimeyrbp(timeyrbp);
            return this;
        }
    
        public V7t antarctictempchange(String antarctictempchange) {
            setAntarctictempchange(antarctictempchange);
            return this;
        }
    
        public V7t antarctictermpuncertainty(String antarctictermpuncertainty) {
            setAntarctictermpuncertainty(antarctictermpuncertainty);
            return this;
        }
    
        
}