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
        character.addAttackPoints(attack);
    }
}
