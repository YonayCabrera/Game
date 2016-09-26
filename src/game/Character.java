package game;


import java.util.*;

public class Character {

    private static final int MAX_MANA = 200;
    private static final int MAX_LIVE = 200;
    private int actualHP;
    private int actualSP;
    private int attack;
    private int defensePoints;
    private List<Item> equipment;
    private int positionX;
    private int positionY;
    private List<Inventory> inventory;


    public Character(int hp, int sp, int attack, int defensePoints, int positionX, int positionY) {

        this.actualHP = hp;
        this.actualSP = sp;
        this.attack = attack;
        this.defensePoints = defensePoints;
        this.positionX = positionX;
        this.positionY = positionY;
        equipment = new ArrayList<>();
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

    public void addItemToInventory(Inventory item) {
        inventory.add(item);

    }


    public int sizeOfEquipment() {
        return equipment.size();
    }

    public int sizeOfInventory() {
        return inventory.size();
    }


    public int getDamage(int attackOfEnemy) {
        if (defensePoints >= attackOfEnemy) return actualHP;
        return actualHP -= (attackOfEnemy - defensePoints);
    }

    public int attackEnemy(Enemy dog) {
        return dog.getDamage(attack);
    }

    public void getPotionOfInventory(Inventory potion) {
        potion.doSomeThing(this);
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

    public void getArmOfInventory(Arm sword) {
        List<Item> actualEquipament = equipment;

        for (Item arm : actualEquipament) {
            if (arm instanceof Arm) {
                addAndRemoveItems(sword,arm);

            }
        }
        if(equipment.isEmpty()) {
            equipment.add(sword);
            sword.doSomeThing(this);
        }
        inventory.remove(sword);
    }

    public void getArmorOfInventory(Armor armor) {
        List<Item> actualEquipament = equipment;
        for (Item armadura : actualEquipament) {
            if (armadura instanceof Armor) {
                addAndRemoveItems(armor, armadura);

            }
        }
        if(equipment.isEmpty()) {
            equipment.add(armor);
            armor.doSomeThing(this);
        }
        inventory.remove(armor);
    }

    private void addAndRemoveItems(Item item, Item armadura) {
        inventory.add(armadura);
        equipment.add(item);
        item.doSomeThing(this);
        armadura.out(this);
        equipment.remove(armadura);
    }

    public void decrementAttackPoints(int attack) {
        this.attack -= attack;
    }

    public void decrementDeffensePoints(int defense) {
        this.defensePoints -= defense;
    }
}
