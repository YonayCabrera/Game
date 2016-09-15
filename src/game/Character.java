package game;


import java.util.HashMap;
import java.util.Map;

public class Character {

    private int actualHP;
    private int actualSP;
    private int attack;
    private int defensePoints;
    private Map<Inventory, Integer> inventory;


    public Character(int hp, int sp, int attack, int defensePoints) {

        this.actualHP = hp;
        this.actualSP = sp;
        this.attack = attack;
        this.defensePoints = defensePoints;
        inventory = new HashMap<>();
    }

    public void addItem(Inventory inventories) {
        inventory.put(inventories, inventory.size() + 1);

    }

    public int getArm(Inventory inventory1) {
        if (inventory.containsKey(inventory1))
            return ((Arm) inventory1).upAttackPoints(attack);
        return attack;

    }

    public int getArmor(Inventory inventory1) {
        if (inventory.containsKey(inventory1))
            return ((Armor) inventory1).upDefensePoints(defensePoints);
        return defensePoints;
    }

    public int getHp(Inventory inventory1) {
        if (inventory.containsKey(inventory1))
            return ((Red) inventory1).takePotion(actualHP);
        return actualHP;
    }


    public int size() {
        return inventory.size();
    }

    public int getSP(Inventory inventory1) {
        if (inventory.containsKey(inventory1))
            return ((Blue) inventory1).takePotion(actualSP);
        return actualSP;
    }

    public int getDamage(int attackOfEnemy) {
        if (defensePoints >= attackOfEnemy) {
            return actualHP;
        }
        return actualHP = actualHP - (attackOfEnemy - defensePoints);
    }

    public int attackEnemy(Enemy dog) {
        return dog.getDamage(attack);
    }
}
