package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Child {

    public String getInfo(){
        return "This is a child";
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
