package com.springcore.ci;

public class Person {
    private String name;
    private int age;
    private Certificate cert;

    public Person(String name, int age, Certificate cert) {
        this.name = name;
        this.age = age;
        this.cert = cert;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + Integer.toString(age) + ", cert=" + cert.getCertificate()+ ", topics=" + cert.getTopics()  + "]";
    }
}
