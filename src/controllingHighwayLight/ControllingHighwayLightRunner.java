package controllingHighwayLight;

public class ControllingHighwayLightRunner {
    public static void main(String[] args) {

        ControllingHighwayLight situation = new ControllingHighwayLight();

        situation.toggleFirstSwitch();
        System.out.println(situation.getLampstate());

        situation.toggleSecondSwitch();
        System.out.println(situation.getLampstate());

        situation.toggleSecondSwitch();
        System.out.println(situation.getLampstate());

    }
}
