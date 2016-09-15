package game;


public class Red extends Potion{
    private int restoreHP;
    public Red(int restaureHP){
        this.restoreHP=restaureHP;
    }


    @Override
    int takePotion(int actualHP) {
        if(actualHP == 200){
            return actualHP;
        }else {
            if ((actualHP + restoreHP) > 200) {
                return 200;
            } else {
                return actualHP + restoreHP;
            }
        }
    }


}
