package com.rahul.JDBCpractice.student2.dao;

import com.rahul.JDBCpractice.student2.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "insert into student(id,name,city) values(?,?,?)";
        return this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
