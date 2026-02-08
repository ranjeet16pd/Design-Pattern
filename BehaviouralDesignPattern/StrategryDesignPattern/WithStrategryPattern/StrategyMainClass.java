package WithStrategryPattern;

import WithStrategryPattern.strategy.CreditCard;

public class StrategyMainClass {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPayment(new CreditCard());
        paymentService.pay();
    }
}
