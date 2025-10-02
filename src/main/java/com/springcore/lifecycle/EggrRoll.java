package com.springcore.lifecycle;


public class EggrRoll {
    private String roll;
    private int price;

    public EggrRoll() { super(); }

    public void setRoll(String roll) { this.roll = roll; }
    public void setPrice(int price) { this.price = price; }
    public String getRoll() { return roll; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "EggrRoll [roll=" + roll + ", price=" + price + "]";
    }

    
    public void start() {
        System.out.println("making egg roll please wait");
    }


    public void end() {
        System.out.println("Pay for the egg roll");
    }
}
