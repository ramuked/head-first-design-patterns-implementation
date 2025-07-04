package main.java.com.patterns.behavorial.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notiyObservers();
}
