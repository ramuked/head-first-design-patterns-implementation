package main.java.com.patterns.behavorial.command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public void setHigh(){
        this.speed = HIGH;
        System.out.println("Speed set to High");
    }

    public void setLow(){
        this.speed = LOW;
        System.out.println("Speed set to Low");

    }


    public void setMedium(){
        this.speed = MEDIUM;
        System.out.println("Speed set to Medium");

    }

    public void turnOff(){
        this.speed = OFF;
        System.out.println("Fan turned Off");
    }

    public int getSpeed(){
        return this.speed;
    }




}
