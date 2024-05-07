package com.rahul.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo = context.getBean("demo",Demo.class);

        System.out.println(demo);
    }
}
