package main.java.com.patterns.behavorial.strategy.behaviors.fly;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("Unable to fly:(");
    }

}
