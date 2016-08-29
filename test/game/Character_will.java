package game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Character_will {
    @Test
    public void take_Red_Potion() {

        Potion red = new Red(200);
        assertEquals(200,red.takePotion());

    }
    @Test
    public void take_Blue_Potion() {

        Potion blue = new Blue(200);
        assertEquals(200,blue.takePotion());

    }
}
