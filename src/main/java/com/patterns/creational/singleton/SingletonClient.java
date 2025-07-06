package main.java.com.patterns.creational.singleton;

public class SingletonClient {

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.getData();

        ThreadSafeSingleton tss = ThreadSafeSingleton.getInstance();
        tss.getData();

        SingletonEnum instance = SingletonEnum.UNIQUE_INSTANCE;
        instance.getData();
    }
}
