package src;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String username) {
        super(cardNumber, username);
    }

    @Override
    public void pay() {
        System.out.println("Payment Done via Debit card pay with user Name : " + username);
    }
}

