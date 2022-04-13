import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private final List<String> songs = new ArrayList<>();
    private final List<Subscriber> subscribers = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public void write(String song){
        songs.add(song);
        notifySubs(song);
    }

    public void notifySubs(String song){
        for (Subscriber subscriber : subscribers){
            subscriber.update(this, song);
        }
    }

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public String getName() {
        return name;
    }

    public List<String> getSongs() {
        return songs;
    }
}
