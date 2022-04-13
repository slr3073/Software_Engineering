package main;

import publisher.Artist;

public interface Subscriber {
    void update(Artist artist, String songName);
}
