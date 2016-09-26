package game;


import java.util.*;

public class Character {

    private static final int MAX_MANA = 200;
    private static final int MAX_LIVE = 200;
    private int actualHP;
    private int actualSP;
    private int attack;
    private int defensePoints;
    private List<Item> inventory;
    private int positionX;
    private int positionY;


    public Character(int hp, int sp, int attack, int defensePoints, int positionX, int positionY) {

        this.actualHP = hp;
        this.actualSP = sp;
        this.attack = attack;
        this.defensePoints = defensePoints;
        this.positionX = positionX;
        this.positionY = positionY;
        inventory = new ArrayList<>();
    }

    public int getActualSP() {
        return actualSP;
    }

    public int getActualHP() {
        return actualHP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void addItem(Item inventories) {
        inventory.add(inventories);

    }


    public int size() {
        return inventory.size();
    }


    public int getDamage(int attackOfEnemy) {
        if (defensePoints >= attackOfEnemy) return actualHP;
        return actualHP -= (attackOfEnemy - defensePoints);
    }

    public int attackEnemy(Enemy dog) {
        return dog.getDamage(attack);
    }

    public void getItem(Item item) {
        item.doSomeThing(this);
    }

    public void health(int restoreHP) {
        int health = getActualHP() + restoreHP;
        if (health < MAX_LIVE) {
            actualHP = health;
        }
    }

    public void restoreMana(int restoreSP) {
        int mana = getActualSP() + restoreSP;
        if (mana < MAX_MANA) {
            actualSP = mana;
        }
    }

    public void addAttackPoints(int attack) {
        this.attack += attack;
    }

    public void addDefensePoints(int defense) {
        this.defensePoints += defense;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void moveTo(World direction) {
        direction.move(this);
    }

    public void position(int x, int y) {
        positionX += x;
        positionY += y;
    }
}
