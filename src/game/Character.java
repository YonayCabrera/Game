package game;


import java.util.HashMap;
import java.util.Map;

public class Character {

    private int hp;
    private int sp;
    private int attack;
    private Map<Inventory,Integer> inventory;

    public Character(int hp, int sp, int attack) {

        this.hp = hp;
        this.sp = sp;
        this.attack = attack;
        inventory = new HashMap<Inventory, Integer>();
    }


}
