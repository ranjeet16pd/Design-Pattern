public class Car {

    //Lazy way of creating Singleton Object
    // constructor should be private so that external Client can not be call
    private Car() {
    }
    private static Car car;
    public static Car getCar() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }
}
