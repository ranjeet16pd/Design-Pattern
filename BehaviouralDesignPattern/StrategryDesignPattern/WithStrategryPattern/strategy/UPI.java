package WithStrategryPattern.strategy;

import WithStrategryPattern.PaymentInterface;

public class UPI implements PaymentInterface {

    @Override
    public void processPayment() {
        System.out.println("Payment from UPI");
    }
}
