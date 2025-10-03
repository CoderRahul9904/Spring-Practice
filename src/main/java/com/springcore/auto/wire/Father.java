package com.springcore.auto.wire;

public class Father {
    private String fatherName;
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

    public Father(Mother mother2) {
        this.mother = mother2;
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
