public class LightsOnCommand implements Command {
    private Light light;
    public LightsOnCommand(Light light) {
        this.light = light;
    }
    public void execute(){
        light.turnOn();
    }
    public void undo(){
        light.turnOff();
    }
}
