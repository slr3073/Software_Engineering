public class Government {
    private static final Government INSTANCE = new Government();

    private Government() {
    }

    public static Government getInstance() {
        return INSTANCE;
    }

    public void doMeasure(String measure){
        System.out.println("The government has " + measure);
    }
}
