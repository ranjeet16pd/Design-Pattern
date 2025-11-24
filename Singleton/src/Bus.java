public class Bus {

    private static volatile Bus bus;

    private Bus() {
    }

    public static Bus getBus() {
        if (bus == null) {                  // 1st check
            synchronized (Bus.class) {
                if (bus == null) {          // 2nd check (important!)
                    bus = new Bus();
                }
            }
        }
        return bus;
    }
}
