package main.java.com.patterns.creational.factory.simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        pizza = switch (PizzaType.valueOf(type.toUpperCase())) {
            case CHEESE -> new CheesePizza();
            case PEPPERONI -> new PepperoniPizza();
            case VEGGIE -> new VeggiePizza();
        };
        return pizza;
    }
}
