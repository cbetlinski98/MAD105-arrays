package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Supplies for Burger Truck");
        String[] strings = {"Hamburger Buns", "Ground Beef", "Cheese", "Tomato", "Lettuce"};
        Arrays.sort(strings);
        for (String supplies : strings) {
            System.out.println(supplies);
        }
    }
}
