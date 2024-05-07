package controllingHighwayLight;

public class ControllingHighwayLight {

    private int firstSwitch, secondSwitch, lampState;

    public ControllingHighwayLight(){
        firstSwitch = 0;
        secondSwitch = 0;
        calculateLampstate();
    }

    public ControllingHighwayLight(int firstSwitch, int secondSwitch) {
        this.firstSwitch = firstSwitch;
        this.secondSwitch = secondSwitch;
        calculateLampstate();
    }

    private void calculateLampstate(){
        lampState = (firstSwitch ^ secondSwitch);
    }

    public void toggleFirstSwitch(){
        firstSwitch = 1 - firstSwitch;
        calculateLampstate();
    }

    public void toggleSecondSwitch(){
        secondSwitch = 1 - secondSwitch;
        calculateLampstate();
    }

    public int getFirstSwitch() {
        return firstSwitch;
    }

    public int getSecondSwitch() {
        return secondSwitch;
    }

    public int getLampstate() {
        return lampState;
    }
}
