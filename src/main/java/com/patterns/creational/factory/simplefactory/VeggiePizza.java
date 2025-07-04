package main.java.com.patterns.creational.factory.simplefactory;

public class VeggiePizza extends Pizza{
    public VeggiePizza(){
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
