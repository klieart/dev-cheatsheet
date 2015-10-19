package ObserverPattern;

//import java.util.Observable;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by klieart on 3/4/15.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;
    //private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current Conditions:\n"+
                        temperature+ " deg F\n"+
                        humidity+"% humidity");
    }



    // Pieces of old code that did not use Observer/Observable java.util classes
    /*
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    */
}
