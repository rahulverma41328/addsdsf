package com.rahul.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person person = (Person) context.getBean("person");

        System.out.println(person);

        ApplicationContext context1 = new ClassPathXmlApplicationContext("ciconfig.xml");
        Addition addition = (Addition) context1.getBean("addition");

        System.out.println(addition);
  }
}
