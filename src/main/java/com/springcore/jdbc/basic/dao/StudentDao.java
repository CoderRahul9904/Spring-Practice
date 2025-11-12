package com.springcore.jdbc.basic.dao;

import com.springcore.jdbc.basic.entities.Student;

public interface StudentDao {
    public int insert(Student student);
    public int delete(int studentId);
}
