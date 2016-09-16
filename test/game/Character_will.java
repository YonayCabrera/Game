package game;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Character_will {

    private Character character;

    @Before
    public void setUp() throws Exception {
        character = new CharacterBuilder()
                .hp(200)
                .sp(200)
                .attack(5)
                .defensePoints(5)
                .createCharacter();
    }

    @Test
    public void take_Red_Potion() {

        Potion red = new Red(200);
        character.addItem(red);
        assertEquals(200, character.getHp(red));

    }
    @Test
    public void take_Blue_Potion() {

        Potion blue = new Blue(200);
        character.addItem(blue);
        assertEquals(200,character.getSP(blue));

    }
    @Test
    public void take_One_Sword() {

        Arm sword = new Sword(15,10);
        character.addItem(sword);
        assertEquals(20,character.getArm(sword));
        assertEquals(10,sword.resistance());
    }
    @Test
    public void take_One_Arc() {

        Arm bow = new Bow(15,10);
        character.addItem(bow);
        assertEquals(20,character.getArm(bow));
        assertEquals(10,bow.resistance());
    }
    @Test
    public void put_One_Armor() {

        Armor armor = new Armor(20,10);
        character.addItem(armor);
        assertEquals(25,character.getArmor(armor));
        assertEquals(10,armor.resistance());

    }
    @Test
    public void put_In_Inventory() {
        character.addItem(new Bow(15,15));
        assertEquals(1,character.size());

    }
    @Test
    public void get_Arm() {
        Arm bow = new Bow(15,15);
        character.addItem(bow);
        assertEquals(20,character.getArm(bow));

    }
    @Test
    public void get_Armor() {
        Armor armor = new Armor(15,15);
        character.addItem(armor);
        assertEquals(20,character.getArmor(armor));

    }
    @Test
    public void attack(){
        Enemy dog = new Dog(200,5,0);
        assertEquals(195,character.attackEnemy(dog));
    }
    @Test
    public void get_someThing(){
        Armor armor = new Armor(15,15);
        character.addItem(armor);
        character.getItem(armor);
        assertThat(character.getDefensePoints(), is (20));
    }

}
