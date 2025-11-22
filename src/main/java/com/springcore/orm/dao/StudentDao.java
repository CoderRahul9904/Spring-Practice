package com.springcore.orm.dao;

import com.springcore.jdbc.basic.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class StudentDao implements StudentDaoImpl{


    private HibernateTemplate hibernateTemplate;


    // Save Student Method
    public int insert(Student student) {
        Integer rowAffect=(Integer) this.hibernateTemplate.save(student);
        return rowAffect;
    }
}
