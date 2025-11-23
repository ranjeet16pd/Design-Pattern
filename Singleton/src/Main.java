
public class Main {
    public static void main(String[] args) {
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

    }
}
