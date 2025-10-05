package com.springcore.spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Add {

    @Value("15")
    private int a;

    @Value("16")
    private int b;

    @Value("#{add.a + add.b}")
    private int c;

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return a+b;
    }

    @Override
    public String toString() {
        return "Add [a=" + a + ", b=" + b + ", a+b=" + c + "]";
    }

}
