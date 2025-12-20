package src;

import java.util.HashMap;

public class PaymentService {

    //Golden Rule : Interface references can point Any Implementing Class Object
    HashMap<String, PaymentMethod> paymentMethodHashMap;

    public PaymentService() {
        paymentMethodHashMap = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod paymentMethod) {
        paymentMethodHashMap.put(name, paymentMethod);
    }

    // We store different implementations behind an interface reference and the J
    // VM decides which method to call at runtime based on the actual object.
    public void makePayment(String name) {
        PaymentMethod paymentMethod = paymentMethodHashMap.get(name);
        paymentMethod.pay();

    }

}
