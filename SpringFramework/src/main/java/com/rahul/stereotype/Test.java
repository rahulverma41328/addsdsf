package com.rahul.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student = context.getBean("student",Student.class);

        Student student1 = context.getBean("student",Student.class);

        Teacher teacher = context.getBean("teacher",Teacher.class);

        System.out.println(teacher);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
