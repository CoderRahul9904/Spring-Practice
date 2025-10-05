package com.springcore.steretype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student student=context.getBean("obj",Student.class);
        System.out.println(student);
        System.out.println(student.getCourses());
    }



}
