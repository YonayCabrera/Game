package game;


public class Sword extends Arm{

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
        Character character1 = new Character(character.getActualHP(),
                character.getActualSP(),
                character.getAttack() + attack,
                character.getDefensePoints());
        character.apply(character1);
    }
}
