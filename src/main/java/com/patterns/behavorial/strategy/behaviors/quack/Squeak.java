package main.java.com.patterns.behavorial.strategy.behaviors.quack;

public class Squeak implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
