package com.springcore.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id=0;
    private String name;
    private List<String> skills;
    private double salary;
    private Map<String, Double> salaryMap;
    private Set<String> mentor;

    public Employee(int id,double salary,Map<String, Double> salaryMap, Set<String> mentor, String name, List<String> skills) {
        super();
        this.id = id;
        this.salaryMap = salaryMap;
        this.mentor = mentor;
        this.name = name;
        this.skills = skills;
        this.salary = salary;
    }
    public Employee() {}
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public List<String> getSkills() {
        return skills;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalaryMap(Map<String, Double> salaryMap) {
        this.salaryMap = salaryMap;
    }

    public Map<String, Double> getSalaryMap() {
        return salaryMap;
    }
    public void setMentor(Set<String> mentor) {
        this.mentor = mentor;
    }
    public Set<String> getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", name='" + name + '\'' +

                ", salary=" + salary +

                ", skills=" + skills +

                ", mentors=" + mentor +

                ", salaryMap=" + salaryMap +
                '}';
    }
}

