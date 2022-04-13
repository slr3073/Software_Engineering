public class Application {
    public static void main(String[] args) {
        Person michel = new Person("Michel");
        Person henri = new Person("Henri");
        Person bernadette = new Person("Bernadette");

        Artist nirvana = new Artist("Nirvana");

        nirvana.subscribe(michel);
        nirvana.subscribe(henri);
        nirvana.subscribe(bernadette);

        nirvana.write("Smells Like Teen Spirit");

        // Garbage music ! I am no longer a teenager
        nirvana.unsubscribe(michel);
        nirvana.unsubscribe(henri);
        nirvana.unsubscribe(bernadette);

        nirvana.write("Heart-Shaped Box");
    }
}
