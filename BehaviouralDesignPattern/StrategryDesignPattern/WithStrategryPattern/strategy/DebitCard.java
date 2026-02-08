package WithStrategryPattern.strategy;

import WithStrategryPattern.PaymentInterface;

public class DebitCard implements PaymentInterface {
    @Override
    public void processPayment() {
        System.out.println("Payment from DebitCard");
    }
}
