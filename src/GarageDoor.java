public class GarageDoor {
    private boolean isOpen;
    public GarageDoor(){
        isOpen = false;
    }
    public GarageDoor(boolean isOpen){
        this.isOpen = isOpen;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    public void open(){
        isOpen = true;
    }
    public void close(){
        isOpen = false;
    }
    public String toString(){
        String string = "The garage door is ";
        string += isOpen? "open." : "closed.";
        return string;
    }
}
