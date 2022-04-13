package main;

import publisher.Artist;

import java.util.Random;

public class Person implements Subscriber {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void subscribe(Artist artist){
        artist.getNotificationManager().subscribe(this);
    }

    public void unsubscribe(Artist artist){
        artist.getNotificationManager().unsubscribe(this);
    }

    @Override
    public void update(Artist artist, String songName) {
        if ((new Random()).nextInt(1, 3) > 1)
            listen(artist, songName);
    }

    private void listen(Artist artist, String songName) {
        System.out.println(name + " has listened '" + songName + "' from '" + artist.getName() + "'");
    }
}
