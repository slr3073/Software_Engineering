package main;

import twitter.ConcreteTwitter;
import twitter.Proxy;
import twitter.Twitter;

public class Application {
    public static void main(String[] args) {
        //this part should be hidden using a factory or dependencies injection
        Twitter twitterService = new Proxy(new ConcreteTwitter());

        String validToken = "slr3073#token12345";

        //with invalid message
        twitterService.tweet("", validToken);

        System.out.println();

        //with invalid token
        twitterService.tweet("I like trains", "");

        System.out.println();

        //valid information
        twitterService.tweet("I like trains", validToken);
    }
}
