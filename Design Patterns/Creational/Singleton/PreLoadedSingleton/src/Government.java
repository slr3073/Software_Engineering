public class Government {
    private static final Government instance = new Government();

    private Government() {
    }

    public static Government getInstance() {
        return instance;
    }

    public void doMeasure(String measure){
        System.out.println("The government has " + measure);
    }
}
