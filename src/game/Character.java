package game;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Character {

    private int hp;
    private int sp;
    private int attack;
    private Map<Inventory,Integer> inventory;

    public Character(int hp, int sp, int attack) {

        this.hp = hp;
        this.sp = sp;
        this.attack = attack;
        inventory = new HashMap<>();
    }

    public Boolean addItem(Inventory inventories){
        inventory.put(inventories,inventory.size()+1);
        return true;
    }
    
    public Boolean getItem(Inventory inventories) {
        return inventory.containsKey(inventories);
    }
}
