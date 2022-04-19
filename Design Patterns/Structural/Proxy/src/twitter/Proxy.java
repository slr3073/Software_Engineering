package twitter;

import java.time.LocalDateTime;

public class Proxy implements Twitter {
    private final Twitter realTwitter;

    public Proxy(Twitter realTwitter) {
        this.realTwitter = realTwitter;
    }

    @Override
    public void tweet(String tweet, String sessionToken) {
        // preprocessing
        if (!isValidSession(sessionToken)) {
            System.out.println("ACCESS DENIED : INVALID TOKEN");
            return;
        }

        if (!isValidTweet(tweet)) {
            System.out.println("TWEET REFUSED : INVALID TWEET SIZE - [1-255]");
            return;
        }

        // pass-though
        realTwitter.tweet(tweet, sessionToken);

        // postprocessing
        System.out.println("[INFO] " + LocalDateTime.now() + " - " + sessionToken + " has tweeted something");

    }

    private boolean isValidSession(String token) {
        return !token.isBlank();
    }

    private boolean isValidTweet(String tweet) {
        return !tweet.isBlank() && tweet.length() <= 255;
    }
}
