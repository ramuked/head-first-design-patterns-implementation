package main.java.com.patterns.creational.factory.simplefactory;

public class PizzaStoreTest {
    public static final String PIZZA_DELIVERY_MESSAGE = "Here's your pizza : ";
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(PIZZA_DELIVERY_MESSAGE+pizza);
        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(PIZZA_DELIVERY_MESSAGE+pizza);
        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(PIZZA_DELIVERY_MESSAGE+pizza);
    }
}
