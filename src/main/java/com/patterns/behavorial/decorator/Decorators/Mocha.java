package main.java.com.patterns.behavorial.decorator.Decorators;

import main.java.com.patterns.behavorial.decorator.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        super.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
