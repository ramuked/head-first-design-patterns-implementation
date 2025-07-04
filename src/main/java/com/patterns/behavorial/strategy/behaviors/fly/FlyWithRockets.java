package main.java.com.patterns.behavorial.strategy.behaviors.fly;

public class FlyWithRockets implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Flying with rockets!!");
    }
}
