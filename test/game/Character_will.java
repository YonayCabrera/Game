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
        character.addItem(red);
        character.getItem(red);
        assertThat(character.getActualHP(), is(200));

    }

    @Test
    public void take_Blue_Potion() {

        Potion blue = new Blue(200);
        character.addItem(blue);
        character.getItem(blue);
        assertThat(character.getActualSP(), is(200));


    }

    @Test
    public void take_One_Sword() {

        Arm sword = new Sword(15, 10);
        character.addItem(sword);
        character.getItem(sword);
        assertThat(character.getAttack(), is(20));
    }

    @Test
    public void put_One_Armor() {

        Armor armor = new Armor(15);
        character.addItem(armor);
        character.getItem(armor);
        assertThat(character.getDefensePoints(), is(20));

    }

    @Test
    public void put_In_Inventory() {
        character.addItem(new Bow(15, 15));
        assertEquals(1, character.size());

    }

    @Test
    public void get_Arm() {
        Arm bow = new Bow(15, 15);
        character.addItem(bow);
        character.getItem(bow);
        assertThat(character.getAttack(), is(20));

    }

    @Test
    public void get_Armor() {
        Armor armor = new Armor(15);
        character.addItem(armor);
        character.getItem(armor);
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
        character.addItem(armor);
        character.getItem(armor);
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
        World  south= new South(0, -1);
        character.moveTo(south);
        assertThat(character.getPositionX(), is(0));
        assertThat(character.getPositionY(), is(0));
    }

}
