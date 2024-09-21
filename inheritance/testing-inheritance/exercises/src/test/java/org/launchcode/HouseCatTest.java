package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HouseCatTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(13, keyboardCat.getWeight(), .001);
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());        //Cat is NOT hungry
        assertFalse(keyboardCat.isTired());         //Cat is NOT tired
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }

}
