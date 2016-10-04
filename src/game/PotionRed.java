package game;


public class PotionRed extends Potion {
    private int restoreHP;

    public PotionRed(int restaureHP) {
        this.restoreHP = restaureHP;
    }


    @Override
    public void doSomeThing(Character character) {

        character.health(restoreHP);

    }

}
