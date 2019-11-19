package com.performance.chillyset.model;

import javax.persistence.*;

@Entity
@Table(name = "HUGE_OBJECT")
public class HugeObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String comment;


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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    
}
