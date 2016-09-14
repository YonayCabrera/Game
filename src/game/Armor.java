package game;


public class Armor extends Inventory{
    private final int defense;
    private final int resistence;

    public Armor(int defensePoints, int resistence) {
        this.defense = defensePoints;
        this.resistence = resistence;
    }

    public int upDefensePoints(int defensePoints) {
        return defense + defensePoints;
    }

    public int resistance() {
        return resistence;
    }

    @Override
    public String toString() {
        return null;
    }
}
