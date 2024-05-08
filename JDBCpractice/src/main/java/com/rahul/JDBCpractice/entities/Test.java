package com.rahul.JDBCpractice.entities;

import com.rahul.JDBCpractice.dao.StudentDao;
import com.rahul.JDBCpractice.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("My program started........");
        // spring jdbc - JDBCTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);

        // insert query
//        String query = "insert into student(id,name,city) values(?,?,?)";
//        template.update(query,322,"lucky verma","suratgarh");
//
//        System.out.println("number of record inserted..");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        Student student = new Student();
//        int id =322;
//
//        int r = studentDao.delete(id);
//        System.out.println("student deleted .. "+ r);

        Student student = studentDao.getStudent(342);
        System.out.println(student);

        List<Student> students = studentDao.getAllStudents();
        for (Student s:students){
            System.out.println(s);
        }
    }
}
