import light.*;

public class Application {
    public static void main(String[] args){
        Light lamp = new Light();
        Command switchOn = new FlipUp(lamp);
        Command switchOff = new FlipDown(lamp);

        LightManager mySwitchManager = new LightManager();
        mySwitchManager.register("on", switchOn);
        mySwitchManager.register("off", switchOff);

        mySwitchManager.execute("on");
        mySwitchManager.execute("off");
    }
}
