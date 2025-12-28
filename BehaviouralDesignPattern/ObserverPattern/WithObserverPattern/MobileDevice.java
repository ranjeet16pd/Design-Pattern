package WithObserverPattern;


public class MobileDevice implements ObserverInterface {

    @Override
    public void update(float temperature) {
        System.out.println("Updated temperature: " + temperature);
    }
}
