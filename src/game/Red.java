package game;


public class Red extends Potion{
    private int restoreHP;
    public Red(int restaureHP){
        this.restoreHP=restaureHP;
    }



    @Override
    public void doSomeThing(Character character) {

        character.health(restoreHP);

    }

}
