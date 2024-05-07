package com.rahul.javaconfig;

import org.springframework.stereotype.Component;

public class Student {

    private Samosa samosa;
    public void study(){
        this.samosa.display();
        System.out.println("student is reading book");
    }

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }
}
