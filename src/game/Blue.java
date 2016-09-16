package game;


public class Blue extends Potion{
    private int restoreSP;

    public Blue(int sp) {

        this.restoreSP = sp;
    }



    @Override
    public void doSomeThing(Character character) {
        int mana =200;

        if(character.getActualSP() < 200){
            if ((character.getActualSP() + restoreSP) > 200) {
                mana = 200;
            } else {
                mana = character.getActualSP() + restoreSP;
            }
        }
        Character character1 = new Character(character.getActualHP(),
                mana,
                character.getAttack(),
                character.getDefensePoints());
        character.apply(character1);
    }
}
