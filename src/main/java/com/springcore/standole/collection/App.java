package com.springcore.standole.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standolecollectionconfig.xml");
        Person person = (Person) context.getBean("friends");
        System.out.println(person);
        Person person1 = (Person) context.getBean("friends");
        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());
    }
}
