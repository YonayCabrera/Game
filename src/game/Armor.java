package game;


public class Armor extends Inventory{
    private final int defensePoints;
    private final int resistence;

    public Armor(int defensePoints, int resistence) {
        this.defensePoints = defensePoints;
        this.resistence = resistence;
    }

    public int upDefensePoints() {
        return defensePoints;
    }

    public int resistance() {
        return resistence;
    }

    @Override
    public String toString() {
        return null;
    }
}
