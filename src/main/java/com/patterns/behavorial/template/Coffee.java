package main.java.com.patterns.behavorial.template;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Brewing Coffee");
    }

    protected @Override
    void addCondiments() {
        System.out.println("Adding Milk and HazelNut");
    }
}
