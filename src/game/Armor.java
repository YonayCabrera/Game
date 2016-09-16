package game;


public class Armor extends Item {
    private final int defense;

    public Armor(int defensePoints) {
        this.defense = defensePoints;
    }


    @Override
    public void doSomeThing(Character character) {
        character.addDefensePoints(defense);
    }
}
