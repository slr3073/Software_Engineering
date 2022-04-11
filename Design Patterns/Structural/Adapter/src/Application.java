public class Application {
    public static void main(String[] args) {
        TimeStation station = new Barometer(new PressureCaptor());

        System.out.println(station.getTime());
    }
}
