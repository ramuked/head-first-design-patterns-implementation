package main.java.com.patterns.behavorial.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        super.description = "Dark Roast";
    }

    public double cost(){
        return 1.35;
    }
}
