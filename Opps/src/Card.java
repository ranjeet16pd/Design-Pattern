package src;

abstract public class Card implements PaymentMethod {

    protected String cardNumber;
    protected String username;

    public Card(String cardNumber, String username) {
        this.cardNumber = cardNumber;
        this.username = username;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUsername() {
        return username;
    }
}
