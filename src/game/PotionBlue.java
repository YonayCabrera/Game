package game;


public class PotionBlue extends Potion{
    private int restoreSP;

    public PotionBlue(int sp) {
        this.restoreSP = sp;
    }

    @Override
    public void doSomeThing(Character character) {
        character.restoreMana(restoreSP);

    }
}
