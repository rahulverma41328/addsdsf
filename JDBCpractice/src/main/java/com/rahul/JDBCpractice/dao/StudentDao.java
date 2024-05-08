package com.rahul.JDBCpractice.dao;

import com.rahul.JDBCpractice.entities.Student;

import java.util.List;

public interface StudentDao {
     int insert(Student student);
     int update(Student student);
     int delete(int studentId);
     public Student getStudent(int studentId);

     public List<Student> getAllStudents();
}
