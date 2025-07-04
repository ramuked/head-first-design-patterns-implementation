package main.java.com.patterns.behavorial.strategy;

import main.java.com.patterns.behavorial.strategy.behaviors.fly.FlyNoWay;
import main.java.com.patterns.behavorial.strategy.behaviors.quack.Squeak;

public class RubberDuck extends Duck{

    RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    void display() {
        System.out.println("I am a RubberDuck");
    }
}
