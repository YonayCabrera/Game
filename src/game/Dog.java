package game;


public class Dog extends Enemy {
    private final int actualHP;
    private final int attack;
    private final int defense;

    public Dog(int actualHP, int attack, int defense) {

        this.actualHP = actualHP;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public int attack(Character character) {
        return character.getDamage(attack);
    }
}
