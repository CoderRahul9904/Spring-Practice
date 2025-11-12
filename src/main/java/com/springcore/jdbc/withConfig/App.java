package com.springcore.jdbc.withConfig;

import com.springcore.jdbc.withConfig.dao.StudentDao;
import com.springcore.jdbc.withConfig.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);

        //Insert Operation
        Student student =new Student();
        student.setAddress("Pune");
        student.setSid(10);
        student.setSname("Ram");

        StudentDao studentDao=(StudentDao)context.getBean("StudentDao");
        int result=studentDao.insert(student);
        System.out.println(result);

        // delete operation
        System.out.println("Deleted operation performing.........");
        int deleteResult=studentDao.delete(3);
        System.out.println(deleteResult);

        //Get id=1 Info
        Student student1=studentDao.getStudent(1);
        System.out.println(student1);

        //Get all Student Info
        System.out.println(studentDao.getAllStudents());
    }
}
