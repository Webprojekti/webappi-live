package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v7")
public class V7 {

    @Id
    @Column(name = "col1")
    private String timekyrbp;
    @Column(name = "col2")
    private String twentyfivepercent;
    @Column(name = "col3")
    private String fiftypercenct;
    @Column(name = "col4")
    private String ninetysevenpointfivepercent;
        public V7() {
        }
    
        public V7(String timekyrbp, String twentyfivepercent, String fiftypercenct, String ninetysevenpointfivepercent) {
            this.timekyrbp = timekyrbp;
            this.twentyfivepercent = twentyfivepercent;
            this.fiftypercenct = fiftypercenct;
            this.ninetysevenpointfivepercent = ninetysevenpointfivepercent;
        }
    
        public String getTimekyrbp() {
            return this.timekyrbp;
        }
    
        public void setTimekyrbp(String timekyrbp) {
            this.timekyrbp = timekyrbp;
        }
    
        public String getTwentyfivepercent() {
            return this.twentyfivepercent;
        }
    
        public void setTwentyfivepercent(String twentyfivepercent) {
            this.twentyfivepercent = twentyfivepercent;
        }
    
        public String getFiftypercenct() {
            return this.fiftypercenct;
        }
    
        public void setFiftypercenct(String fiftypercenct) {
            this.fiftypercenct = fiftypercenct;
        }
    
        public String getNinetysevenpointfivepercent() {
            return this.ninetysevenpointfivepercent;
        }
    
        public void setNinetysevenpointfivepercent(String ninetysevenpointfivepercent) {
            this.ninetysevenpointfivepercent = ninetysevenpointfivepercent;
        }
    
        public V7 timekyrbp(String timekyrbp) {
            setTimekyrbp(timekyrbp);
            return this;
        }
    
        public V7 twentyfivepercent(String twentyfivepercent) {
            setTwentyfivepercent(twentyfivepercent);
            return this;
        }
    
        public V7 fiftypercenct(String fiftypercenct) {
            setFiftypercenct(fiftypercenct);
            return this;
        }
    
        public V7 ninetysevenpointfivepercent(String ninetysevenpointfivepercent) {
            setNinetysevenpointfivepercent(ninetysevenpointfivepercent);
            return this;
        }
    

        }
    