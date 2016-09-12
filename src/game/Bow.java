package game;


public class Bow extends Arm {
    private final int attack;
    private final int resistance;

    public Bow(int attack, int resistance) {

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

    @Override
    public String toString() {
        return null;
    }
}
