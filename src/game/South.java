package game;

/**
 * Created by yon on 26/09/2016.
 */
public class South extends World {
    private final int x = 0;
    private final int y = -1;


    @Override
    public void move(Character character) {
        character.position(x, y);
    }
}
