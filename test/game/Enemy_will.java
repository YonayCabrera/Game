package game;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Enemy_will {
    @Test
    public void Attack_character(){
        Enemy enemy = new Dog(200,5,5);
        Character character = new Character(200,200,5,5);
        assertEquals(200,enemy.attack(character));

    }
}
