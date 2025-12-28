package WithObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation {

    private float temperature;
    private List<ObserverInterface> observers;

    WheatherStation() {
        this.temperature = 0F;
        observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void addDevice(ObserverInterface observer) {
        observers.add(observer);
    }

    public void removeDevice(ObserverInterface observer) {
        observers.remove(observer);
    }

    public float getTemperature() {
        return temperature;
    }


    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update(temperature);
        }
    }

}
