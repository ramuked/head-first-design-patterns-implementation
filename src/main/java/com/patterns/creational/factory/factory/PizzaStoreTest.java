package main.java.com.patterns.creational.factory.factory;

public class PizzaStoreTest {
    public static final String PIZZA_DELIVERY_MESSAGE = "Here's your pizza : ";
    public static void main(String[] args){

        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(PIZZA_DELIVERY_MESSAGE+pizza.getName());


        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza1 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(PIZZA_DELIVERY_MESSAGE+pizza.getName());

    }
}
