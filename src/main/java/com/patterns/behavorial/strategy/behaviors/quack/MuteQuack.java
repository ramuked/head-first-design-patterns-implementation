package main.java.com.patterns.behavorial.strategy.behaviors.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {

        System.out.println("<<Silence>>");
    }
}
