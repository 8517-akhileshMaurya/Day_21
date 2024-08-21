package com.example.Day_21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car_wxml {

    @Autowired
    private Engin_wxml enginWxml;


    public void build(){
        enginWxml.new_engin();
        System.out.println("Working on car");
    }

}
