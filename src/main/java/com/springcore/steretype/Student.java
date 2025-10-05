package com.springcore.steretype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("obj")
public class Student {
    @Value("Rahul")
    private String studentName;
    @Value("h162dc")
    private String studentID;
    @Value("Male")
    private String studentGender;
    @Value("#{course}")
    private List<String> courses;

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentID() {
        return studentID;
    }
    public String getStudentGender() {
        return studentGender;
    }
    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentID=" + studentID + ", studentGender=" + studentGender + "]";
    }
}
