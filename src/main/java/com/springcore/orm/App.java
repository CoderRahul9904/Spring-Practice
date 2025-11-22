package com.springcore.orm;

import com.springcore.orm.dao.StudentDao;
import com.springcore.orm.dao.StudentDaoImpl;
import com.springcore.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springHibernateConfig.xml");
        StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("StudentDao");
        Student student = new Student();
        student.setSname("Ananya");
        student.setSage("Sharma");
        student.setAddress("Pune");

        studentDao.insert(student);
    }
}
