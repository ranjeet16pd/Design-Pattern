public enum Bus {

    INSTANCE;

    public void run() {
        System.out.println("Bus is running...");
    }

//    private static volatile Bus bus;

//    private Bus() {
//        if (bus != null) {
//            throw new IllegalStateException("Bus is already initialized and you are trying to break singleton pattern");
//        }
//    }
//
//    public static Bus getBus() {
//        if (bus == null) {                  // 1st check
//            synchronized (Bus.class) {
//                if (bus == null) {          // 2nd check (important!)
//                    bus = new Bus();
//                }
//            }
//        }
//        return bus;
//    }
};
