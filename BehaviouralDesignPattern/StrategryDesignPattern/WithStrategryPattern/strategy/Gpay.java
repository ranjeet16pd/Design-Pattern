package WithStrategryPattern.strategy;

import WithStrategryPattern.PaymentInterface;

public class Gpay implements PaymentInterface {
    @Override
    public void processPayment() {
        System.out.println("Payment from Gpay");

    }
}
