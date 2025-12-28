package WithoutObserverPatttern;


class DisplayDevices {
    public void showTempreture(float temperature) {
        System.out.println("Current temperature: " + temperature + "\u00B0");
    }
}

class WhetherStation {
    private float temperature;
    private final DisplayDevices displayDevices;


    WhetherStation(DisplayDevices displayDevices) {
        this.displayDevices = displayDevices;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyToDevices();
    }

    public void notifyToDevices() {
        displayDevices.showTempreture(temperature);
    }
}


public class WithoutObserverPattern {

    public static void main(String[] args) {
        DisplayDevices displayDevices = new DisplayDevices();
        // very tight coupling code
        WhetherStation whetherStation = new WhetherStation(displayDevices);
        whetherStation.setTemperature(25.4f);
        whetherStation.setTemperature(55.4f);
    }


}
