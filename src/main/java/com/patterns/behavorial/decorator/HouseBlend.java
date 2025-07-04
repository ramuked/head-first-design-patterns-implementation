package main.java.com.patterns.behavorial.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        super.description = "House Blend";
    }

    public double cost(){
        return 1.5;
    }
}
