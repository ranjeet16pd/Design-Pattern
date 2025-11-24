public class Bike {

    // Eger Way to implement Singleton Design Pattern
    private static Bike bike = new Bike();      //--> Ye class Load hote hi sirf ek bar hi create hoga

    // getBike ye sirf ek reference ko return krta h
    public static Bike getBike() {
        return bike;
    }

}
