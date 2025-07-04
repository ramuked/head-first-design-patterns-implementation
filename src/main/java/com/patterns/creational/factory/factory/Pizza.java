package main.java.com.patterns.creational.factory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println(", Tossing dough : "+dough);
        System.out.println(", Adding sauce : : "+sauce);
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake() {
        System.out.println("Baking");

    }
    void cut() {
        System.out.println("Cutting");
    }
    void box() {
        System.out.println("Boxing");
    }
    public String getName() {
        return name;
    }
}