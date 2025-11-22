package com.springcore.orm.dao;

import com.springcore.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao implements StudentDaoImpl {

    private HibernateTemplate hibernateTemplate;

    // No-arg constructor (required for Spring's default instantiation)
    public StudentDao() {
    }

    // Optional convenience constructor you can keep
    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // Save Student Method
    @Transactional
    public int insert(Student student) {
        Integer rowAffect = (Integer) this.hibernateTemplate.save(student);
        return rowAffect;
    }

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return this.hibernateTemplate;
    }

    // IMPORTANT: actually set the template (was empty before)
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
