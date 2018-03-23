package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cat")
public class Cat {

    private String catType;

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}
