package main.java.com.patterns.behavorial.decorator;

public class Espresso extends Beverage{

    public Espresso(){
        super.description = "Espresso";
    }

    @Override
    public double cost(){
        return 0.99;
    }

}
