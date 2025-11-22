package com.springcore.orm.entities;

import jakarta.persistence.*;
import org.springframework.orm.hibernate5.HibernateTemplate;

@Entity
@Table(name= "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    @Column(name = "name")
    private String sname;
    @Column(name = "surname")
    private String sage;
    private String address;

    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSage() {
        return sage;
    }
    public void setSage(String sage) {
        this.sage = sage;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Student(){
        super();
    }
    @Override
    public String toString() {
        return " " + sid + " " + sname + " " + sage + " " + address;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
    }
}
