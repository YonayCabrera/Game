package game;

/**
 * Created by yon on 26/09/2016.
 */
public class North extends World{
    private final int x;
    private final int y;

    public North(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void move(Character character) {
        character.position(x,y);
    }
}
