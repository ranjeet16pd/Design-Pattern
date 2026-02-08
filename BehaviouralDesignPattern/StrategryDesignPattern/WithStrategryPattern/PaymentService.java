package WithStrategryPattern;

public class PaymentService {

    private PaymentInterface payment;

    public void setPayment(PaymentInterface payment) {
        this.payment = payment;
    }

    public void pay() {
        payment.processPayment();
    }


}
