package com.rahul.JDBCpractice.dao;

import com.rahul.JDBCpractice.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        // query
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int update(Student student) {
        String query = "update student set name=? , city=? where id=?";
        return this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        return this.jdbcTemplate.update(query,studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        // selecting single student data
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        // selecting multiple students
        String query = "select * from student";
        return this.jdbcTemplate.query(query,new RowMapperImpl());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
