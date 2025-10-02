package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Map;

public class Oro implements InitializingBean, DisposableBean {
    private String color;
    private int price;
    private Map<String, String> flavourMapping;

    public Oro(String color, int price, Map<String, String> flavourMapping) {
        this.color = color;
        this.price = price;
        this.flavourMapping = flavourMapping;
    }

    @Override
    public String toString() {
        return "Oro [color=" + color + ", flavourMapping=" + flavourMapping + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Oro afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Oro destroy");
    }

}
