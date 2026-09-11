package Observer;

import java.util.ArrayList;
import java.util.List;

interface Idisplay {
    void update();
}


interface Istation {
    void register(Idisplay display);

    void remove(Idisplay display);

    void changeTemp(String temp);

    String getLatestTemp();
}


class Station implements Istation {


    List<Idisplay> displays;
    String temp;

    Station(String temp) {
        this.displays = new ArrayList<>();
        this.temp = temp;
    }

    @Override
    public void register(Idisplay display) {
        displays.add(display);

    }

    @Override
    public void remove(Idisplay display) {
        displays.remove(display);
    }

    @Override
    public void changeTemp(String temp) {
        System.out.println("The New Temp is : " + temp);
        this.temp = temp;
        notifyTemp();

    }

    public void notifyTemp() {
        for (Idisplay dis : displays) {
            System.out.println("Temp changes to : ");
            dis.update();
        }
    }

    @Override
    public String getLatestTemp() {
        System.out.println("The Latest Temp is " + temp);
        return temp;
    }
}


class Display implements Idisplay {

    Station station;

    Display(Station station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println(
                "Display updated. Latest temperature: "
                        + station.getLatestTemp()
        );

    }
}


public class WhetherStationObserverMain {


    public static void main(String[] args) {

        Station station = new Station("22@C");

        Display display1 = new Display(station);
        Display display2 = new Display(station);
        Display display3 = new Display(station);

        station.register(display1);
        station.register(display1);
        station.register(display2);
        station.register(display3);

        station.changeTemp("46@C");


    }


}
