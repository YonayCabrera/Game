package game;

/**
 * Created by yon on 26/09/2016.
 */
public class West extends World {
    private final int x;
    private final int y;

    public West(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(Character character) {
        character.position(x,y);
    }
}
