package com.springcore.jdbc.basic.dao;

import com.springcore.jdbc.basic.entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
}
