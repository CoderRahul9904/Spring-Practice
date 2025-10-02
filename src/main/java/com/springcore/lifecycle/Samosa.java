package com.springcore.lifecycle;

import java.util.List;

public class Samosa {
    private String ingredients;
    private int price;
    private List<String> review;

    public Samosa(String ingredients, int price, List<String> review) {
        this.ingredients = ingredients;
        this.price = price;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Samosa [ingredients=" + ingredients + ", price=" + price + ", review=" + review;
    }

    public void hey(){
        System.out.println("Samosa init");
    }

    public void bye(){
        System.out.println("Samosa destroy");
    }
}
