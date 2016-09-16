package game;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Enemy_will {

    private Character character;

    @Before
    public void setUp() throws Exception {
        character = new CharacterBuilder()
                .hp(200).sp(200)
                .attack(5)
                .defensePoints(5)
                .createCharacter();
    }

    @Test
    public void Attack_character(){
        Enemy dog = new Dog(200,5,5);
        assertEquals(200,dog.attack(character));

    }
}
