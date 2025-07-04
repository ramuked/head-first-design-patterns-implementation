package main.java.com.patterns.behavorial.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions: " +
                "Temperature: " + temperature +
                ", Humidity: "+ humidity +
                ", Pressure: "+pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();;
    }
}
