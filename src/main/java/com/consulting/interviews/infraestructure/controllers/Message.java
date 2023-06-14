package com.consulting.interviews.infraestructure.controllers;

public class Message {
    private String description;
    public Message(String description){
        this.description = description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
