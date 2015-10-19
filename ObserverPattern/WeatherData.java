package ObserverPattern;

import java.util.ArrayList;
import java.util.Observable;
//import java.util.Observer;

/**
 * Created by klieart on 3/4/15.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    // Notify the observers when we get updated measurements from Weather Station
    public void measurementsChanged() {
        setChanged();
        notifyObservers(); // NOTE: We don't PUSH Observer obj as param, therefore Observer must PULL state from Observable obj.
    }

    // This method to represent getting data from the weather service
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }


    // Pieces of old code that did not use Observer/Observable java.util classes
    /*
    // private ArrayList observers;

    // Constructor creates array that will hold objects
    public WeatherData() {
        observers = new ArrayList();
    }

    // Add/subscribe an observer who requested it
    public void registerObserver(Object o){
        observers.add(o);
    }

    // Remove/un-subscribe an observer who requested it
    public void removeObserver(Object o){
        observers.remove(o);
    }

    // Send the updated state to all subscribers
    // NOTE: All Java objects inherit from the Object superclass. Observers is holding an instance of type Object.
    // To eliminate this ambiguity, we must typecast the result of "observers.get()" with "(Observer)".
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    */
}
