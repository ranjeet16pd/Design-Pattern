package Observer;

import java.util.ArrayList;
import java.util.List;

// observer
interface IUsers {
    void update();
}


interface IStcoks {
    void subscribe(IUsers user);

    void Unsubscribe(IUsers user);

    void changeStock(String price);

    String getLatestPrice();

}

class Stocks implements IStcoks {

    List<IUsers> users;
    String Price, Name;

    Stocks(String Name, String Price) {
        this.Name = Name;
        this.Price = Price;
        users = new ArrayList<>();
    }


    @Override
    public void subscribe(IUsers user) {
        System.out.println(user + "start Watching " + Name);
        users.add(user);
    }

    @Override
    public void Unsubscribe(IUsers user) {
        users.remove(user);
    }

    @Override
    public String getLatestPrice() {
        return Price;
    }

    @Override
    public void changeStock(String price) {
        System.out.println("The Stocks Price is Changed to : " + price);
        this.Price = price;
        notifyAllUsers();
    }


    public void notifyAllUsers() {
        for (IUsers user : users) {
            user.update();
        }
    }

}


class User implements IUsers {


    IStcoks stcoks;


    User(IStcoks stcoks) {
        this.stcoks = stcoks;
    }

    @Override
    public void update() {
        System.out.println("Stock price updated to: " + stcoks.getLatestPrice());
    }
}


public class StcokPriceNotificationSystemMain {

    public static void main(String[] args) {

        IStcoks stock = new Stocks("TCS", "1");


        IUsers users1 = new User(stock);
        IUsers users2 = new User(stock);
        IUsers users3 = new User(stock);
        IUsers users4 = new User(stock);

        stock.subscribe(users1);
        stock.subscribe(users2);
        stock.subscribe(users3);
        stock.subscribe(users4);


        stock.changeStock("234");

        System.out.println(stock.getLatestPrice());


    }
}
