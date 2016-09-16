package game;


public class Bow extends Arm {
    private final int attack;
    private final int resistance;

    public Bow(int attack, int resistance) {

        this.attack = attack;
        this.resistance = resistance;
    }


    @Override
    public int resistance() {
        return resistance;
    }


    @Override
    public void doSomeThing(Character character) {
        Character character1 = new Character(character.getActualHP(),
                character.getActualSP(),
                character.getAttack() + attack,
                character.getDefensePoints());
        character.apply(character1);
    }
}
