package com.springcore.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {

    private static SessionFactory sessionFactory;
    static{
        try{
            if(sessionFactory==null){
                sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
