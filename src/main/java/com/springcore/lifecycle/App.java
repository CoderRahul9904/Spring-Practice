package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Samosa samosa = (Samosa) context.getBean("samosa");
//        System.out.println(samosa);
//        context.registerShutdownHook();
          Oro oro = (Oro) context.getBean("oro");
          System.out.println(oro);
          context.close();
    }
}
