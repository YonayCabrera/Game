package game;


public class Armor extends Inventory{
    private final int defense;
    private final int resistence;

    public Armor(int defensePoints, int resistence) {
        this.defense = defensePoints;
        this.resistence = resistence;
    }

    public int upDefensePoints(int defensePoints) {
        int armor = defensePoints + defense;
        Character.apply(armor);
        return armor;
    }

    public int resistance() {
        return resistence;
    }


}
