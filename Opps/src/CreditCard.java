package src;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String username) {
        super(cardNumber, username);
    }

    @Override
    public void pay() {
        System.out.println("Payment Done via CreditCard | User : " + username + " Card Number : " + cardNumber);
    }

}
