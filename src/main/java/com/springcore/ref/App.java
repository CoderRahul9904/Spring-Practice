package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("refconfig.xml");
        A a=(A)context.getBean("BrefA");
        System.out.println(a);
    }
}
