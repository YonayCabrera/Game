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
                .positionX(0)
                .positionY(0)
                .createCharacter();
    }

    @Test
    public void take_Red_Potion() {

        Potion red = new Red(200);
        character.addItemToInventory(red);
        character.getPotionOfInventory(red);
        assertThat(character.getActualHP(), is(200));

    }

    @Test
    public void take_Blue_Potion() {

        Potion blue = new Blue(200);
        character.addItemToInventory(blue);
        character.getPotionOfInventory(blue);
        assertThat(character.getActualSP(), is(200));


    }

    @Test
    public void take_One_Sword() {

        Arm sword = new Sword(15, 10);
        character.addItemToInventory(sword);
        character.getArmOfInventory(sword);
        assertThat(character.getAttack(), is(20));
    }

    @Test
    public void put_One_Armor() {

        Armor armor = new Armor(15);
        character.addItemToInventory(armor);
        character.getArmorOfInventory(armor);
        assertThat(character.getDefensePoints(), is(20));

    }

    @Test
    public void put_In_Inventory() {
        character.addItemToInventory(new Bow(15, 15));
        assertEquals(1, character.sizeOfInventory());

    }

    @Test
    public void get_Arm() {
        Arm bow = new Bow(15, 15);
        character.addItemToInventory(bow);
        character.getArmOfInventory(bow);
        assertThat(character.getAttack(), is(20));

    }

    @Test
    public void get_Armor() {
        Armor armor = new Armor(15);
        character.addItemToInventory(armor);
        character.getArmorOfInventory(armor);
        assertThat(character.getDefensePoints(), is(20));

    }

    @Test
    public void attack() {
        Enemy dog = new Dog(200, 5, 0);
        assertEquals(195, character.attackEnemy(dog));
    }

    @Test
    public void get_someThing() {
        Armor armor = new Armor(15);
        character.addItemToInventory(armor);
        character.getArmorOfInventory(armor);
        assertThat(character.getDefensePoints(), is(20));
    }

    @Test
    public void get_position() {
        assertThat(character.getPositionX(), is(0));
        assertThat(character.getPositionY(), is(0));
    }

    @Test
    public void move_north() {
        North north = new North(0, 1);
        character.moveTo(north);
        assertThat(character.getPositionX(), is(0));
        assertThat(character.getPositionY(), is(1));
    }

    @Test
    public void move_north_east_west_south() {
        World north = new North(0, 1);
        character.moveTo(north);
        World east = new East(1, 0);
        character.moveTo(east);
        World west = new West(-1, 0);
        character.moveTo(west);
        World south = new South(0, -1);
        character.moveTo(south);
        assertThat(character.getPositionX(), is(0));
        assertThat(character.getPositionY(), is(0));
    }

    @Test
    public void equipment_two_arms() {
        Arm sword = new Sword(15, 15);
        Arm bow = new Bow(15, 15);
        character.addItemToInventory(sword);
        character.getArmOfInventory(sword);
        character.addItemToInventory(bow);
        character.getArmOfInventory(bow);
        assertThat(character.sizeOfEquipment(), is(1));
        assertThat(character.getAttack(),is(20));
    }

    @Test
    public void equipment_one_arm() {
        Arm sword = new Sword(15, 15);
        character.addItemToInventory(sword);
        character.getArmOfInventory(sword);
        assertThat(character.sizeOfEquipment(), is(1));
    }

    @Test
    public void equipment_two_armors() {
        Armor armor1 = new Armor(15);
        Armor armor2 = new Armor(15);
        character.addItemToInventory(armor1);
        character.getArmorOfInventory(armor1);
        character.addItemToInventory(armor2);
        character.getArmorOfInventory(armor2);
        assertThat(character.sizeOfEquipment(), is(1));
        assertThat(character.getDefensePoints(), is(20));
    }
}


