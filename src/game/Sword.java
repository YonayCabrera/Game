package game;


public class Sword extends Arm{

    private final int attack;
    private final int resistence;

    public Sword(int attack, int resistence) {
        this.attack = attack;
        this.resistence = resistence;
    }

    @Override
    public int upAttackPoints(int basicAttack) {
        return basicAttack + attack;
    }

    @Override
    public int resistance() {
        return resistence;
    }

    @Override
    public String toString() {
        return null;
    }
}
