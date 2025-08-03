package main.java.com.patterns.behavorial.template;

public class CaffeineClient {
    public static void main(String[] args){
        CaffeineBeverage beverage = new Tea();
        beverage.prepareRecipe();
        beverage = new Coffee();
        beverage.prepareRecipe();;
        beverage = new CoffeeWithHook();
        beverage.prepareRecipe();
    }
}
