package game;


public class Armor extends Item {
    private final int defense;
    private final int resistence;

    public Armor(int defensePoints, int resistence) {
        this.defense = defensePoints;
        this.resistence = resistence;
    }

    public int upDefensePoints(int defensePoints) {
        int armor = defensePoints + defense;
        return armor;
    }

    public int resistance() {
        return resistence;
    }


    @Override
    public void doSomeThing(Character character) {
        Character character1 = new Character(character.getActualHP(),
                character.getActualSP(),
                character.getAttack(),
                character.getDefensePoints() + defense);
        character.apply(character1);
    }
}
