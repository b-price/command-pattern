public class RemoteControl {
    private Command command;
    public RemoteControl(){
    }
    public RemoteControl(Command command){
        this.command = command;
    }
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
    public Command getCommand(){
        return command;
    }
}
