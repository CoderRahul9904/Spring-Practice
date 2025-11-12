package com.springcore.jdbc.withConfig.dao;

import com.springcore.jdbc.withConfig.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setAddress(rs.getString("address"));
        student.setSid(rs.getInt("sid"));
        student.setSname(rs.getString("name"));
        return student;
    }
}
