package com.springcore.spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sub")
public class Sub {
    @Value("15")
    private int a;
    @Value("16")
    private int b;

    @Value("#{T(java.lang.Math).abs(sub.a - sub.b)}")
    private int c;

    public Sub() {
        super();
    }
    public int sub(){
        return Math.abs(a - b);
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return "Sub [a=" + a + ", b=" + b + ", |a-b|=" + c + "]";
    }

}
