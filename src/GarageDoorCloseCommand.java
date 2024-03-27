public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute(){
        garageDoor.close();
    }
    public void undo() {
        garageDoor.open();
    }
}
