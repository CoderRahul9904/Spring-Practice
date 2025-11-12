package com.springcore.jdbc.basic;

import com.springcore.jdbc.basic.dao.StudentDao;
import com.springcore.jdbc.basic.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcconfig.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        //sql query
        StudentDao studentDao = (StudentDao) context.getBean("StudentDao");
        Student student = new Student();
        student.setAddress("Pune");
        student.setSid(3);
        student.setSname("Shambhavi");
        int result = studentDao.insert(student);
        System.out.println(result);
    }
}
