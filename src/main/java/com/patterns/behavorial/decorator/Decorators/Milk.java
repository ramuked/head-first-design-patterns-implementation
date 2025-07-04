package main.java.com.patterns.behavorial.decorator.Decorators;

import main.java.com.patterns.behavorial.decorator.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        super.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
