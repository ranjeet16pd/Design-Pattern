import src.PaymentService;

public class Main {
    public static void main(String[] args) {
        Writeable writeable = new Writeable();
        writeable.writeFile("test.txt");
        writeable.readFile("test.txt");

        Readable readable = new Readable();

        readable.readFile("rj.txt");


    }
}
