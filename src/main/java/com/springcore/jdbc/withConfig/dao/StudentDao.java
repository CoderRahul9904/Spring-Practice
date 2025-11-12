package com.springcore.jdbc.withConfig.dao;

import com.springcore.jdbc.withConfig.entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
}

