package com.rahul.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");

        Emp emp = context.getBean("Emp", Emp.class);

        System.out.println(emp.getPhones().getClass().getName());
    }
}
