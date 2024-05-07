package com.rahul.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("aloneconfig.xml");
        Person person = context.getBean("person1",Person.class);

        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        context.close();
    }
}
