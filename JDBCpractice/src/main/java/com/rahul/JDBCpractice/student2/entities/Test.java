package com.rahul.JDBCpractice.student2.entities;

import com.rahul.JDBCpractice.student2.dao.StudentDao;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("student2config.xml");

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setId(233);
        student.setCity("suratgarh");
        student.setName("Harshal");

        int r = studentDao.insert(student);
        System.out.println("record added.. "+ r);
    }
}
