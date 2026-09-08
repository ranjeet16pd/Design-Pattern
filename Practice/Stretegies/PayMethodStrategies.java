package Stretegies;


//stretegies
interface payMethod {
    public void pay();
}

//concrete stretegies
class payThroughCreditCard implements payMethod {

    public void pay() {
        System.out.println("Payment done through Credit Card");
    }
}

class payThroughUPI implements payMethod {
    @Override
    public void pay() {
        System.out.println("Payment Done through UPI");
    }
}

class payThroughDebitCard implements payMethod {
    @Override
    public void pay() {
        System.out.println("Payment Done through Debit Card");
    }
}

class payThroughPayPal implements payMethod {
    @Override
    public void pay() {
        System.out.println("Payment Done through PayPal");
    }
}


//making the client
class doPayment {
    payMethod payMethod;
    doPayment(payMethod payMethod) {
        this.payMethod = payMethod;
    }
    public void pay() {
        payMethod.pay();
    }

}


public class PayMethodStrategies {


    public static void main(String[] args){


        doPayment doPayment1=new doPayment(new payThroughUPI());
        doPayment doPayment2=new doPayment(new payThroughCreditCard());
        doPayment doPayment3= new doPayment(new payThroughPayPal());
        doPayment doPayment4=new doPayment(new payThroughDebitCard());
        doPayment1.pay();
        doPayment2.pay();
        doPayment3.pay();
        doPayment4.pay();

    }






}
