package com.udacity.jwdnd.c1.review;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private String message;

    public MessageService(String message){
        this.message = message;
    }
    public String uppercase(){
        return this.message.toUpperCase();
    }
    public String lowercase(){
        return this.message.toLowerCase();
    }
    @PostConstruct //for logging the creation of the MessageService
    public void postConstruct(){
        System.out.println("Creating MessageService bean");
    }
}
