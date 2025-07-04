package main.java.com.patterns.behavorial.strategy;

import main.java.com.patterns.behavorial.strategy.behaviors.fly.FlyWithRockets;
import main.java.com.patterns.behavorial.strategy.behaviors.quack.MuteQuack;
import main.java.com.patterns.behavorial.strategy.behaviors.quack.Quack;

public class RobotDuck extends Duck{

    RobotDuck(){
        super(new FlyWithRockets(), new Quack());
    }

    @Override
    void display() {
        System.out.println("I am a Robot Duck");
    }
}
