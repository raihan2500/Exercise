package controllingHighwayLight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class ControllingHighwayLightTest {

    ControllingHighwayLight person1 = new ControllingHighwayLight();
    ControllingHighwayLight person2 = new ControllingHighwayLight(1,0);

    @Test
    void checkLampstatePerson1(){
        assertEquals(0,person1.getLampstate());
    }

    @Test
    void checkLampstatePerson2(){
        assertEquals(1,person2.getLampstate());
    }

    @Test
    void checkLampstatePerson1AfterToggling(){
        person1.toggleFirstSwitch();
        assertEquals(1,person1.getLampstate());
    }

    @Test
    void checkLampstatePerson2AfterToggling(){
        person2.toggleSecondSwitch();
        assertEquals(0,person2.getLampstate());
    }

    @Test
    void checkLampstatePerson1AfterAgainToggling(){
        person1.toggleFirstSwitch();
        assertEquals(1,person1.getLampstate());
    }

}