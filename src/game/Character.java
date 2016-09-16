package game;


import java.util.*;

public class Character {

    private int actualHP;
    private int actualSP;
    private int attack;
    private int defensePoints;
    private List<Inventory> inventory;


    public Character(int hp, int sp, int attack, int defensePoints) {

        this.actualHP = hp;
        this.actualSP = sp;
        this.attack = attack;
        this.defensePoints = defensePoints;
        inventory = new ArrayList<>();
    }

    public void addItem(Inventory inventories) {
        inventory.add(inventories);

    }

    public int getArm(Arm arm) {
        if (inventory.contains(arm)) {
            return (arm.upAttackPoints(attack));
        }
        return attack;

    }

    public int getArmor(Armor armor) {
        if (inventory.contains(armor))
            return (armor.upDefensePoints(defensePoints));
        return defensePoints;
    }

    public int getHp(Potion red) {
        if (inventory.contains(red))
            return (red.takePotion(actualHP));
        return actualHP;
    }


    public int size() {
        return inventory.size();
    }

    public int getSP(Potion blue) {
        if (inventory.contains(blue)) {
            return (blue.takePotion(actualSP));
        }
        return actualSP;
    }

    public int getDamage(int attackOfEnemy) {
        if (defensePoints >= attackOfEnemy) return actualHP;
        return actualHP -= (attackOfEnemy - defensePoints);
    }

    public int attackEnemy(Enemy dog) {
        return dog.getDamage(attack);
    }
    public static void apply(int num){

    }
}
