package twitter;

public class ConcreteTwitter implements Twitter {
    @Override
    public void tweet(String tweet, String sessionToken) {
        System.out.println(sessionToken + " : " + tweet);
    }
}
