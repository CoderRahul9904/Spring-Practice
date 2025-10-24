package com.springcore.jdbc.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcconfig.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        //sql query
        String sql = "insert into students(sid,name,surname,address) values(?,?,?,?)";
        int result=jdbcTemplate.update(sql,21,"Rahul","Mourya","Near Jai Hind High School Pimpri - 17");
        System.out.println(result);
    }
}
