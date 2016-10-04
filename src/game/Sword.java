package game;


public class Sword extends Weapon {

    private final int attack;
    private final int resistence;

    public Sword(int attack, int resistence) {
        this.attack = attack;
        this.resistence = resistence;
    }


    @Override
    public int resistance() {
        return resistence;
    }


    @Override
    public void doSomeThing(Character character) {
        character.addAttackPoints(attack);
    }

    @Override
    public void out(Character character) {
        character.decrementAttackPoints(attack);
    }
}
