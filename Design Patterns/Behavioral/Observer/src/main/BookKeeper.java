package main;

import publisher.Artist;

public class BookKeeper implements Subscriber{
    private String name;

    public BookKeeper(String name) {
        this.name = name;
    }

    @Override
    public void update(Artist artist, String songName) {
        System.out.println(name + " has updated the accounting books !");
    }

    public void subscribe(Artist artist){
        artist.getNotificationManager().subscribe(this);
    }

    public void unsubscribe(Artist artist){
        artist.getNotificationManager().unsubscribe(this);
    }

}
