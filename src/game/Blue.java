package game;


public class Blue extends Potion{
    private int restoreSP;

    public Blue(int sp) {
        this.restoreSP = sp;
    }

    @Override
    public void doSomeThing(Character character) {
        character.restoreMana(restoreSP);

    }
}
