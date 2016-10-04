package game;

/**
 * Created by yon on 26/09/2016.
 */
public class East extends World {
    private final int x=1;
    private final int y=0;


    @Override
    public void move(Character character) {
        character.position(x,y);
    }
}
