package publisher;

import main.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private final List<Subscriber> subscribers = new ArrayList<>();

    void notifySubs(Artist artist, String song){
        for (Subscriber subscriber : subscribers){
            subscriber.update(artist, song);
        }
    }

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

}
