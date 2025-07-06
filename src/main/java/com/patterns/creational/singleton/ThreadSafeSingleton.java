package main.java.com.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        if(uniqueInstance == null){
            synchronized (ThreadSafeSingleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ThreadSafeSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void getData(){
        System.out.println("In Unique ThreadSafe Singleton");
    }
}
