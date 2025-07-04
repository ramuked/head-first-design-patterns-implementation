package main.java.com.patterns.behavorial.decorator.Decorators;

import main.java.com.patterns.behavorial.decorator.Beverage;
import main.java.com.patterns.behavorial.decorator.DarkRoast;

public class CafeMain {
    public static void main(String[] args){

        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);
        System.out.println("Your Beverage: "+ beverage.getDescription());
        System.out.println("Cost : "+beverage.cost());
    }
}
