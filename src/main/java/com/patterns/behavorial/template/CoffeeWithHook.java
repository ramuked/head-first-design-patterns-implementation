package main.java.com.patterns.behavorial.template;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage{

    @Override
   void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Milk and HazelNut");
    }

    @Override
    boolean customerWantsCondiments(){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want Hazelnut ?");
        String res = in.nextLine();
        in.close();
        return res.toLowerCase().startsWith("y");
    }
}
