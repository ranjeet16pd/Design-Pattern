package src;

public class Admin implements Employee {

    @Override
    public int salary() {
        System.out.println("Hr salary ......");
        return 10000;
    }
}
