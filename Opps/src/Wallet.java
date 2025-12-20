package src;

public class Wallet implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying Via Wallet | Id : rj123");

    }
}
