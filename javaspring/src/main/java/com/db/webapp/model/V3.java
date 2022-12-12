package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="v3")
public class V3 {



    @Id
    @Column(name ="col1")
    private String year;
    @Column(name ="col2")
    private String month;
    @Column(name ="col3")
    private String decimaldate;
    @Column(name ="col4")
    private String average;
    @Column(name ="col5")
    private String deseasonalized;
    @Column(name ="col6")
    private String ndays;
    @Column(name ="col7")
    private String sdev;
    @Column(name ="col8")
    private String unc;
    @Column(name ="col9")
    private String yearmonth;

    public V3(){}


    public V3(String year, String month, String decimaldate, String average, String deseasonalized, String ndays, String sdev, String unc, String yearmonth) {
        this.year = year;
        this.month = month;
        this.decimaldate = decimaldate;
        this.average = average;
        this.deseasonalized = deseasonalized;
        this.ndays = ndays;
        this.sdev = sdev;
        this.unc = unc;
        this.yearmonth = yearmonth;
    }

 

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDecimaldate() {
        return this.decimaldate;
    }

    public void setDecimaldate(String decimaldate) {
        this.decimaldate = decimaldate;
    }

    public String getAverage() {
        return this.average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getDeseasonalized() {
        return this.deseasonalized;
    }

    public void setDeseasonalized(String deseasonalized) {
        this.deseasonalized = deseasonalized;
    }

    public String getNdays() {
        return this.ndays;
    }

    public void setNdays(String ndays) {
        this.ndays = ndays;
    }

    public String getSdev() {
        return this.sdev;
    }

    public void setSdev(String sdev) {
        this.sdev = sdev;
    }

    public String getUnc() {
        return this.unc;
    }

    public void setUnc(String unc) {
        this.unc = unc;
    }

    public String getYearmonth() {
        return this.yearmonth;
    }

    public void setYearmonth(String yearmonth) {
        this.yearmonth = yearmonth;
    }

    public V3 year(String year) {
        setYear(year);
        return this;
    }

    public V3 month(String month) {
        setMonth(month);
        return this;
    }

    public V3 decimaldate(String decimaldate) {
        setDecimaldate(decimaldate);
        return this;
    }

    public V3 average(String average) {
        setAverage(average);
        return this;
    }

    public V3 deseasonalized(String deseasonalized) {
        setDeseasonalized(deseasonalized);
        return this;
    }

    public V3 ndays(String ndays) {
        setNdays(ndays);
        return this;
    }

    public V3 sdev(String sdev) {
        setSdev(sdev);
        return this;
    }

    public V3 unc(String unc) {
        setUnc(unc);
        return this;
    }

    public V3 yearmonth(String yearmonth) {
        setYearmonth(yearmonth);
        return this;
    }



}