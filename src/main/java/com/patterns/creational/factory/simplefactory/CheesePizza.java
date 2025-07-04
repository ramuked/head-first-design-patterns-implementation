package main.java.com.patterns.creational.factory.simplefactory;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Mozzarella Cheese");
        toppings.add("Parmesan");
    }
}
