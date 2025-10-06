package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Father {
    @Autowired
    private Child child;

    public String getInfo(){
        return "I am father";
    }

    @Override
    public String toString() {
        return "Father [getInfo()=" + getInfo() + "]" + "\n child=" + child.getInfo();
    }
}
