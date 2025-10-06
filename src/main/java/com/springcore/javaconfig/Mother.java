package com.springcore.javaconfig;


public class Mother {
    private Child child;
    private Father father;

    public Mother(Father getFatherInfo, Child getChildInfo) {
        super();
        this.father = getFatherInfo;
        this.child = getChildInfo;
    }

    public String getInfo(){
        return "Am the Mother";
    }

    @Override
    public String toString() {
        return "I am the Head of the family" + getInfo() + " and the defender of the family" + father.getInfo() + " am the future of the family " + child.getInfo();
    }
}
