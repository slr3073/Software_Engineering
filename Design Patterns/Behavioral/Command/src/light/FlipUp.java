package light;

public class FlipUp implements Command {
    private Light light;

    public FlipUp(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
