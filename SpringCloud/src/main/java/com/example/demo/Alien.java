package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    public Alien(){
        System.out.println("Alien object created..");
    }
    @Autowired   //This laptop obj will be created by the spring  || ByName or ByType
    Laptop lap;

    public void code(){
        lap.compile();
    }
}
