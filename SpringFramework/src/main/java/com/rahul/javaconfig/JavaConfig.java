package com.rahul.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean
    public Student getStudent() {
        // creating a student object
        Student student = new Student(getSamosa());
        return student;
    }
}
