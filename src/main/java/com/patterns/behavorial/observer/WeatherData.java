package main.java.com.patterns.behavorial.observer;
import java.util.ArrayList;
import java.util.List;
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }



    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notiyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public void measurementsChanged(){
        notiyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
