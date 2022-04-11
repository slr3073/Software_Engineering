public class Barometer implements TimeStation{
    private final PressureCaptor pressureCaptor;

    public Barometer(PressureCaptor pressureCaptor) {
        this.pressureCaptor = pressureCaptor;
    }

    @Override
    public String getTime() {
        int pressure = pressureCaptor.getPressure();
        if(pressure <= 965) return "STORM";
        if(pressure <= 980) return "RAIN";
        if(pressure <= 1015) return "CHANGE";
        if(pressure <= 1035) return "FAIR";
        return "DRY";
    }
}
