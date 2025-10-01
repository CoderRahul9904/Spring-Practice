package com.springcore.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee employees=(Employee) context.getBean("employee");
        System.out.println(employees);
    }
}
