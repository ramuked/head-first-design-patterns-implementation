package main.java.com.patterns.creational.factory.abstractfactory;


public class PizzaStoreTest {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza1 = pizzaStore.orderPizza("cheese");
        System.out.println(pizza1.getName());

        Pizza pizza2 = pizzaStore.orderPizza("clams");
        System.out.println(pizza2.getName());

        Pizza pizza3 = pizzaStore.orderPizza("veggie");
        System.out.println(pizza3.getName());

    }
}
