package Observer;

import java.util.ArrayList;
import java.util.List;

interface Isubscriber {
    void update();
}


interface Ichannel {
    void subscribe(Isubscriber subscriber);

    void unSubscribe(Isubscriber subscriber);

    void notifySubscribers();
}


// subject
class Channel implements Ichannel {

    private
    List<Isubscriber> subscribers;
    String name;
    String latestVideo;

    Channel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Isubscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unSubscribe(Isubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Isubscriber sub : subscribers) {
            sub.update();
        }
    }

    public void uploadVideo(String title) {
        latestVideo = title;
        System.out.println("latest video name  : " + latestVideo);
        notifySubscribers();
    }

    public String getVideoData() {
        return "\nCheckout our new Video : " + latestVideo + "\n";
    }

}

class Subscriber implements Isubscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name, Channel channel) {
        this.channel = channel;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + "," + channel.getVideoData());
    }
}


public class ObserverMain {
    public static void main(String[] args) {

        Channel channel = new Channel("Rj-Studio");

        Subscriber subscriber1 = new Subscriber("Ranjeet", channel);
        Subscriber subscriber2 = new Subscriber("Tarun", channel);

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.uploadVideo("CODER TECH");

        channel.unSubscribe(subscriber1);
        channel.uploadVideo("State Design Pattern");


    }
}
