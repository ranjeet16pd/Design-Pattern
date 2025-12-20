package src;

/*
 abstract : Card is Incomplete
 PaymentMethod : Card follows the contract of  paymentMethod
 ---> Card say I agree with contract. But i do not implement it .
 My Children will implement it . So i use abstract keyWord
 */
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
