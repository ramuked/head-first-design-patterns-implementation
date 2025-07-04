package main.java.com.patterns.behavorial.strategy.behaviors.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Flying With Wings");
    }
}
