package game;


public class Bow extends Arm {
    private final int attack;
    private final int resistance;

    public Bow(int attack, int resistance) {

        this.attack = attack;
        this.resistance = resistance;
    }

    @Override
    public int upAttackPoints(int basicAttack) {
        return attack + basicAttack;
    }

    @Override
    public int resistance() {
        return resistance;
    }


}
