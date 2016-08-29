package game;


public class Blue extends Potion{
    private int mana;

    public Blue(int mana) {

        this.mana = mana;
    }

    public int takePotion() {
        return mana;
    }
}
