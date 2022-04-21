package light;

public class FlipDown implements Command {
    private Light light;

    public FlipDown(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
