package WithStrategryPattern.strategy;

import WithStrategryPattern.PaymentInterface;

public class Cash implements PaymentInterface {
    @Override
    public void processPayment() {
        System.out.println("Payment from CreditCard");
    }
}
