package main.java.com.patterns.behavorial.template;

public class Tea extends CaffeineBeverage{

    @Override
   void brew() {
        System.out.println("Brewing Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Ginger and Lemon");
    }
}
