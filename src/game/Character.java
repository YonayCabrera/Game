package game;


import java.util.*;

public class Character {

    private int actualHP;
    private int actualSP;
    private int attack;
    private int defensePoints;
    private List<Item> inventory;


    public Character(int hp, int sp, int attack, int defensePoints) {

        this.actualHP = hp;
        this.actualSP = sp;
        this.attack = attack;
        this.defensePoints = defensePoints;
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
    public void getItem(Item item){
        item.doSomeThing(this);
    }
    public void apply(Character character1){
        defensePoints = character1.getDefensePoints();
        attack = character1.getAttack();
        actualHP=character1.getActualHP();
        actualSP=character1.getActualSP();
    }

}
