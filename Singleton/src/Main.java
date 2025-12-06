import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       /*
        System.out.println("------------Singleton Design Pattern using Lazy Way---------");
        Car car1 = Car.getCar();
        Car car2 = Car.getCar();
        if (car1.hashCode() == car2.hashCode()) {
            System.out.println("Cars are the same! So it follow Singleton Design Pattern using Lazy Way");
        } else {
            System.out.println("Cars are not the same!");
        }


        System.out.println("------------Singleton Design Pattern using Eger Way---------");

        Bike bike1 = Bike.getBike();
        Bike bike2 = Bike.getBike();
        if (bike1.hashCode() == bike2.hashCode()) {
            System.out.println("Bikes are the same!");
        } else {
            System.out.println("Bikes are not the same!");
        }


        // TEST USING MULTITHREADING
        System.out.println("------------Singleton Design Pattern using Lazy Way Using  Multiple Thread---------");
        Runnable task = () -> {
            Bus bus = Bus.getBus();
            System.out.println(Thread.currentThread().getName() + "------>" + bus);
        };

        // Creating multiple Thread
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();

        */

        /*
        Ways 3 to break singleton pattern
         */

        Bus bus1 = Bus.INSTANCE;
        System.out.println("Car 1 Hash code is " + bus1.hashCode());

        // Now making the new instance of class using reflection API
        Constructor<Bus> constructor = Bus.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Bus bus2 = constructor.newInstance();
        System.out.println("Car 2 Hash code is " + bus2.hashCode());


    }
}
