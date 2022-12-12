package com.db.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v9")
public class V9 {

    @Id
    @Column(name = "col1")
    private String name;
    @Column(name = "col2")
    private String values;

    public V9() {
    }


    public V9(String name, String values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValues() {
        return this.values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public V9 name(String name) {
        setName(name);
        return this;
    }

    public V9 values(String values) {
        setValues(values);
        return this;
    }




}