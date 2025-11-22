package com.springcore.orm.dao;

import com.springcore.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public interface StudentDaoImpl {
    public int insert(Student student);
    public HibernateTemplate getHibernateTemplate();

}
