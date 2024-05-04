package com.rahul.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowireannotation.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }
}
