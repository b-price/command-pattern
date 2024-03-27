public class client {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightsOnCommand(light);
        Command lightsOff = new LightsOffCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        System.out.println(light);
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
        System.out.println(light);
        //switch on
        control.setCommand(garageDoorOpen);
        control.pressButton();
        System.out.println(garageDoor);
        //switch off
        control.setCommand(garageDoorClose);
        control.pressButton();
        System.out.println(garageDoor);
    }
}