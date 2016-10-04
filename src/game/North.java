package game;

/**
 * Created by yon on 26/09/2016.
 */
public class North extends World{
    private final int x=0;
    private final int y=1;


    public void move(Character character) {
        character.position(x,y);
    }
}
