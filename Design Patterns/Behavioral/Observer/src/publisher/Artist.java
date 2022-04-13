package publisher;

import main.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private final List<String> songs = new ArrayList<>();

    private final NotificationManager notificationManager = new NotificationManager();

    public Artist(String name) {
        this.name = name;
    }

    public void write(String song){
        songs.add(song);
        notificationManager.notifySubs(this, song);
    }

    public String getName() {
        return name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }
}
