package game;


public class Red extends Potion{
    private int restoreHP;
    public Red(int restaureHP){
        this.restoreHP=restaureHP;
    }



    @Override
    public void doSomeThing(Character character) {
        int live =200;

        if(character.getActualHP() < 200){
            if ((character.getActualHP() + restoreHP) > 200) {
                live = 200;
            } else {
                live = character.getActualHP() + restoreHP;
            }
        }
        Character character1 = new Character(live,
                character.getActualSP(),
                character.getAttack(),
                character.getDefensePoints());
        character.apply(character1);
    }
}
