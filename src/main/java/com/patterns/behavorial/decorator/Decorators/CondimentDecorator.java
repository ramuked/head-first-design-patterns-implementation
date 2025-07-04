package main.java.com.patterns.behavorial.decorator.Decorators;

import main.java.com.patterns.behavorial.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();
}
