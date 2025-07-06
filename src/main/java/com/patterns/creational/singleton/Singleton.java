package main.java.com.patterns.creational.singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public void getData(){
        System.out.println("In Unique Singleton -> Basics");
    }


}
