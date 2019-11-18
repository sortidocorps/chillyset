package com.michelin.chillyset.model;

import javax.persistence.*;

@Entity
@Table(name = "SIMPLE_OBJECT")
public class SimpleObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String casualName;

    private String location;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCasualName() {
        return casualName;
    }

    public void setCasualName(String casualName) {
        this.casualName = casualName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
