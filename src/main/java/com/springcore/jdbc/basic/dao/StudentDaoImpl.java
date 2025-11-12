package com.springcore.jdbc.basic.dao;

import com.springcore.jdbc.basic.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{
    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String sql="insert into students(sid,name,surname,address) values(?,?,?,?)";
        int result=jdbcTemplate.update(sql,student.getSid(),student.getSname(),"Gandhi",student.getAddress());
        return result;
    }

    @Override
    public int delete(int studentId) {
        String sql="delete from students where sid=?";
        int result=jdbcTemplate.update(sql,studentId);
        return result;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
