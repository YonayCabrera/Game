package game;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Character {

    private int hp;
    private int sp;
    private int attack;
    private int defensePoints;
    private Map<Inventory,Integer> inventory;

    public Character(int hp, int sp, int attack, int defensePoints) {

        this.hp = hp;
        this.sp = sp;
        this.attack = attack;
        this.defensePoints = defensePoints;
        inventory = new HashMap<>();
    }

    public void addItem(Inventory inventories){
        inventory.put(inventories,inventory.size()+1);

    }

    public void getArm(Inventory inventories) {
        if(inventory.containsKey(inventories)) {
            ((Arm) inventories).upAttackPoints(attack);
        }

    }
    public void getArmor(Inventory inventories) {
        if (inventory.containsKey(inventories))
            ((Armor) inventories).upDefensePoints(defensePoints);
    }


    public int size() {
        return inventory.size();
    }
}
