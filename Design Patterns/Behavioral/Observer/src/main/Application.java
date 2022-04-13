package main;

import publisher.Artist;

public class Application {
    public static void main(String[] args) {
        Person michel = new Person("Michel");
        Person henri = new Person("Henri");
        Person bernadette = new Person("Bernadette");

        BookKeeper legitBookKeeper= new BookKeeper("A definitely legit book-keeper");

        Artist nirvana = new Artist("Nirvana");

        michel.subscribe(nirvana);
        henri.subscribe(nirvana);
        bernadette.subscribe(nirvana);

        legitBookKeeper.subscribe(nirvana);

        nirvana.write("Smells Like Teen Spirit");

        // Garbage music ! I am no longer a teenager
        michel.unsubscribe(nirvana);
        henri.unsubscribe(nirvana);
        bernadette.unsubscribe(nirvana);

        nirvana.write("Heart-Shaped Box");
    }
}
