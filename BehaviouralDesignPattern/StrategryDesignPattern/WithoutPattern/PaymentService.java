package WithoutPattern;

public class PaymentService {


    public void processPayments(String paymentMethod) {
        if (paymentMethod.equals("Cash")) {
            System.out.println("Payment method cash");
        } else if (paymentMethod.equals("Debit")) {
            System.out.println("Payment method debit");
        } else if (paymentMethod.equals("Credit")) {
            System.out.println("Payment method credit");
        } else if (paymentMethod.equals("UPI")) {
            System.out.println("Payment method UPI");
        } else {
            System.out.println("Payment method unknown");
        }
    }

    public  static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayments("U");
    }


}
