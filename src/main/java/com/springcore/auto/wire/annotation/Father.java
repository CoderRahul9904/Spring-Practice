package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Father {
    private String fatherName;
    @Autowired
    @Qualifier("mother123")
    private Mother mother;

    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMotherName() {
        return mother.getFirstName();
    }

    public Father(Mother mother) {
        this.mother = mother;
    }
    public Father(String fatherName) {
        this.fatherName = fatherName;

    }

    public Father() {
        super();
    }
    @Override
    public String toString() {
        return "I am Father " + fatherName + " and I am Mother " + mother.getFirstName();
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }
}
