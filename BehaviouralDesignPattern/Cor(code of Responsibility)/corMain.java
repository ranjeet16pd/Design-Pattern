

abstract class MoneyHandler {
    protected MoneyHandler nextMoneyHandler;

    MoneyHandler() {
        nextMoneyHandler = null;
    }

    public void setNextMoneyHandler(MoneyHandler nextMoneyHandler) {
        this.nextMoneyHandler = nextMoneyHandler;
    }

    public abstract void dispences(int amount);

}


class ThousandHandler extends MoneyHandler {

     int numNotes = 0;

    ThousandHandler(int amt) {
        numNotes = amt;
    }
    @Override
    public void dispences(int amount) {
        int notesNedded = amount / 1000;
        int remaningNotes = amount - notesNedded;
        if (remaningNotes != 0)
            numNotes = remaningNotes;
        else numNotes = 0;

        if (notesNedded > 0) {
            System.out.println("Dispensing " + notesNedded + " x ₹1000 notes");
        }
        int remainingAmount = remaningNotes * 1000;
        if (remainingAmount > 0) {
            if (nextMoneyHandler != null) {
                nextMoneyHandler.dispences(remainingAmount);
            } else {
                System.out.println("Remaining amount of " + remainingAmount + " cannot be fulfilled (Insufficinet fund in ATM");
            }
        }
    }
}


public class corMain {

}
