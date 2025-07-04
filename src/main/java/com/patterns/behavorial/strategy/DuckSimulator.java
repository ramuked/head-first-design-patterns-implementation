package main.java.com.patterns.behavorial.strategy;

import main.java.com.patterns.behavorial.strategy.behaviors.fly.FlyWithWings;

public class DuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();

        Duck robot = new RobotDuck();
        robot.performFly();
        robot.setFlyBehaviour(new FlyWithWings());
        robot.performFly();
    }

}
