package main.java.com.patterns.behavorial.decorator.Decorators;

import main.java.com.patterns.behavorial.decorator.Beverage;

public class Whip extends  CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WHip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
