package main.java.com.patterns.behavorial.strategy;

import main.java.com.patterns.behavorial.strategy.behaviors.fly.FlyWithWings;
import main.java.com.patterns.behavorial.strategy.behaviors.quack.Quack;

public class MallardDuck extends Duck{

    MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }

    public void display(){
        System.out.println("I am a  Mallard Duck");
    }


}
