
public class Main {
    public static void main(String[] args) {
        System.out.println("------------Singleton Desing Pattern using Lazy Way---------");
        Car car1 = Car.getCar();
        Car car2 = Car.getCar();
        if (car1.hashCode() == car2.hashCode()) {
            System.out.println("Cars are the same! So it follow Singleton Design Pattern using Lazy Way");
        } else {
            System.out.println("Cars are not the same!");
        }

    }
}
