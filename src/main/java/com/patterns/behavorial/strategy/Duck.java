package main.java.com.patterns.behavorial.strategy;

import main.java.com.patterns.behavorial.strategy.behaviors.fly.FlyBehavior;
import main.java.com.patterns.behavorial.strategy.behaviors.quack.QuackBehavior;

public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("Swimming In Water");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    abstract void display();

    public void setFlyBehaviour(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void performQuck(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

}
