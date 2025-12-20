package src;

import java.util.HashMap;
import java.util.Map;

public class MakePayment {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("ranjeetDC", new DebitCard("1234","ranjeetDc"));
        paymentService.addPaymentMethod("ranjeetCC", new CreditCard("5678","ranjeetCc"));

        paymentService.makePayment("ranjeetDC");


    }


}
