package com.springcore.hibernate;

import com.springcore.hibernate.entities.Student;
import com.springcore.hibernate.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();
        System.out.println(sessionFactory);

        Student student=new Student();
        student.setSname("Shambhavi");
        student.setSage("Mishra");
        student.setAddress("Dil mai");
//        student.setSid(15);

        Session session=sessionFactory.openSession();
        Transaction transaction=null;
        try {
            transaction=session.beginTransaction();
            session.persist(student);
            transaction.commit();

            System.out.println("Successfully persisted student");
        } catch (RuntimeException e) {
            if(transaction!=null)
                transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
