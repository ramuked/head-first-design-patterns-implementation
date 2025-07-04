package main.java.com.patterns.creational.factory.simplefactory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated Parmesan Cheese");
    }
}
