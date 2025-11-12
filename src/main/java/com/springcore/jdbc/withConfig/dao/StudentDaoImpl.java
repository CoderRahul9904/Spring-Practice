package com.springcore.jdbc.withConfig.dao;

import com.springcore.jdbc.withConfig.dao.RowMapperImpl;
import com.springcore.jdbc.withConfig.dao.StudentDao;
import com.springcore.jdbc.withConfig.entities.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String sql="insert into students(sid,name,surname,address) values(?,?,?,?)";
        int result=jdbcTemplate.update(sql,student.getSid(),student.getSname(),"Gandhi",student.getAddress());
        return result;
    }

    @Override
    public Student getStudent(int studentId) {
        RowMapper<Student> studentRowMapper = new com.springcore.jdbc.withConfig.dao.RowMapperImpl();
        String sql="select * from students where sid=?";
        Student student=this.jdbcTemplate.queryForObject(sql, studentRowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String sql="select * from students";
        RowMapper<Student> studentRowMapper = new RowMapperImpl();
        List<Student> student=this.jdbcTemplate.query(sql, studentRowMapper);
        return student;
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
