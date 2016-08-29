package game;


public class Arc extends Arm {
    private final int attack;
    private final int resistance;

    public Arc(int attack, int resistance) {

        this.attack = attack;
        this.resistance = resistance;
    }

    @Override
    public int upAttackPoints() {
        return attack;
    }

    @Override
    public int resistance() {
        return resistance;
    }
}
