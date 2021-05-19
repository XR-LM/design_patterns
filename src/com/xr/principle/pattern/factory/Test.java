package com.xr.principle.pattern.factory;

public class Test {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("american");
        System.out.println(latte.getName());
    }
}
