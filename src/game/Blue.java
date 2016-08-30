package game;


public class Blue extends Potion{
    private int sp;

    public Blue(int sp) {

        this.sp = sp;
    }

    public int takePotion() {
        return sp;
    }
}
