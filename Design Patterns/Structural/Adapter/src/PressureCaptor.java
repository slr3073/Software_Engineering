import java.util.Random;

public class PressureCaptor {

    public int getPressure(){
        return( new Random()).nextInt(940, 1060);
    }
}
