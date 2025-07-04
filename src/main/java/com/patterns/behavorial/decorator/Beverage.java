package main.java.com.patterns.behavorial.decorator;

public abstract class Beverage {
    protected String description = "Undefined Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
