package com.db.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v8")
public class V8 {


    @Id

    String key;
    java.io.Serializable values;



    public V8() {
    }


    public V8(String key, java.io.Serializable values) {
        this.key = key;
        this.values = values;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public java.io.Serializable getValues() {
        return this.values;
    }

    public void setValues(java.io.Serializable values) {
        this.values = values;
    }

    public V8 key(String key) {
        setKey(key);
        return this;
    }

    public V8 values(java.io.Serializable values) {
        setValues(values);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " key='" + getKey() + "'" +
            ", values='" + getValues() + "'" +
            "}";
    }



}