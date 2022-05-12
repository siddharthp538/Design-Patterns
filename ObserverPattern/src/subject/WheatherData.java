package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WheatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(temperature , humidity , pressure);
    }

    public void setMeasurements(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }



}