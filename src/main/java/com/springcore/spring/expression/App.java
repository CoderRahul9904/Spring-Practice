package com.springcore.spring.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springexpressionconfig.xml");
        Add add = (Add) context.getBean("add");
        System.out.println(add);
        Sub sub = (Sub) context.getBean("sub");
        System.out.println(sub);
    }
}
