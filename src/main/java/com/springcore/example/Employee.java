package com.springcore.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id=0;
    private String name;
    private List<Employee> skills;
    private double salary;
    private Map<Employee, Double> salaryMap;
    private Set<Employee> mentor;

    public Employee(int id,double salary,Map<Employee, Double> salaryMap, Set<Employee> mentor, String name, List<Employee> skills) {
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
    public void setSkills(List<Employee> skills) {
        this.skills = skills;
    }
    public List<Employee> getSkills() {
        return skills;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalaryMap(Map<Employee, Double> salaryMap) {
        this.salaryMap = salaryMap;
    }

    public Map<Employee, Double> getSalaryMap() {
        return salaryMap;
    }
    public void setMentor(Set<Employee> mentor) {
        this.mentor = mentor;
    }
    public Set<Employee> getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        String mentorNames = mentor.isEmpty()
                ? "[]"
                : mentor.stream()
                .map(m -> m.name + " (id=" + m.id + ")")
                .reduce((a, b) -> a + ", " + b)
                .map(s -> "[" + s + "]")
                .orElse("[]");

        return "Employee{" +

                ", name='" + name + '\'' +

                ", salary=" + salary +

                ", skills=" + skills +

                ", mentors=" + mentorNames +
                '}';
    }
}

