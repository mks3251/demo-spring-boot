package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "demo")
public class MongoDoc {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
