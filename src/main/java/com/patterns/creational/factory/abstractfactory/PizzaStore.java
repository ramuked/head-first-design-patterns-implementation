package main.java.com.patterns.creational.factory.abstractfactory;

public abstract  class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
