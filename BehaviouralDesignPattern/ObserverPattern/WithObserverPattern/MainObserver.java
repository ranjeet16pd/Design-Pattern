package WithObserverPattern;

import java.util.Observer;

public class MainObserver {

    public static void main(String[] args) {

        WheatherStation wheatherStation = new WheatherStation();
        ObserverInterface observer1 = new MobileDevice();
        wheatherStation.addDevice(observer1);
        wheatherStation.setTemperature(50.0F);
        wheatherStation.removeDevice(observer1);

        ObserverInterface observer2 = new MobileDevice();
        wheatherStation.addDevice(observer2);
        wheatherStation.setTemperature(60.0F);

        wheatherStation.setTemperature(70.0F);


    }
}
