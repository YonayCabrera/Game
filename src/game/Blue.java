package game;


public class Blue extends Potion{
    private int restoreSP;

    public Blue(int sp) {

        this.restoreSP = sp;
    }

    public int takePotion(int actualSP) {
        if(actualSP == 200){
            return actualSP;
        }else {
            if ((actualSP + restoreSP) > 200) {
                return 200;
            } else {
                return actualSP + restoreSP;
            }
        }
    }


    @Override
    public void doSomeThing(Character character) {

    }
}
