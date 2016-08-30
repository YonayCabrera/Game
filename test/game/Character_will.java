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
    @Test
    public void take_One_Sword() {

        Arm sword = new Sword(15,10);
        assertEquals(15,sword.upAttackPoints());
        assertEquals(10,sword.resistance());
    }
    @Test
    public void take_One_Arc() {

        Arm arc = new Arc(15,10);
        assertEquals(15,arc.upAttackPoints());
        assertEquals(10,arc.resistance());
    }
    @Test
    public void put_One_Armor() {

        Armor armor = new Armor(20,10);
        assertEquals(20,armor.upDefensePoints());
        assertEquals(10,armor.resistance());

    }
    @Test
    public void have_All_Hp() {

        Character character = new Character(200,200,5);


    }


}
