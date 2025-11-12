package com.springcore.jdbc.basic;

import com.springcore.jdbc.basic.dao.StudentDao;
import com.springcore.jdbc.basic.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcconfig.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        //sql query
        StudentDao studentDao = (StudentDao) context.getBean("StudentDao");
        Student student = new Student();
        student.setAddress("Pune");
        student.setSid(6);
        student.setSname("Soniya");

//        int result = studentDao.insert(student);

//        System.out.println("Please enter the id you wanna delete");
//        int id = sc.nextInt();
        List<Student> result = studentDao.getAllStudents();
        for(Student s:result){
            System.out.println(s);
        }
    }
}
