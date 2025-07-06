package main.java.com.patterns.creational.singleton;
public enum SingletonEnum {
    UNIQUE_INSTANCE;

    public void getData(){
        System.out.println("In Unique Singleton via Enum");
    }
}
