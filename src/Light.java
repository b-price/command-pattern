public class Light {
    private boolean isOn;
    public Light(){
        isOn = false;
    }
    public Light(boolean isOn){
        this.isOn = isOn;
    }
    public boolean getIsOn(){
        return isOn;
    }
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public String toString(){
        String string = "The light is ";
        string += isOn? "on." : "off.";
        return string;
    }
}
