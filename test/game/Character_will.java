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
        Character character = new Character(200,200,5,5);
        character.addItem(sword);
        assertEquals(20,character.getArm(sword));
        assertEquals(10,sword.resistance());
    }
    @Test
    public void take_One_Arc() {

        Arm bow = new Bow(15,10);
        Character character = new Character(200,200,5,5);
        character.addItem(bow);
        assertEquals(20,character.getArm(bow));
        assertEquals(10,bow.resistance());
    }
    @Test
    public void put_One_Armor() {

        Armor armor = new Armor(20,10);
        Character character = new Character(200,200,5,5);
        character.addItem(armor);
        assertEquals(25,character.getArmor(armor));
        assertEquals(10,armor.resistance());

    }
    @Test
    public void put_In_Inventory() {
        Character character = new Character(200,200,5,5);
        character.addItem(new Bow(15,15));
        assertEquals(1,character.size());

    }
    @Test
    public void get_Arm() {
        Character character = new Character(200,200,5,5);
        Inventory bow = new Bow(15,15);
        character.addItem(bow);
        assertEquals(20,character.getArm(bow));

    }
    @Test
    public void get_Armor() {
        Character character = new Character(200,200,5,5);
        Inventory armor = new Armor(15,15);
        character.addItem(armor);
        assertEquals(20,character.getArmor(armor));

    }


}
