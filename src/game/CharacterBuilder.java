package game;

public class CharacterBuilder {
    private int hp;
    private int sp;
    private int attack;
    private int defensePoints;
    private int positionX;
    private int positionY;

    public CharacterBuilder hp(int hp) {
        this.hp = hp;
        return this;
    }

    public CharacterBuilder sp(int sp) {
        this.sp = sp;
        return this;
    }

    public CharacterBuilder attack(int attack) {
        this.attack = attack;
        return this;
    }

    public CharacterBuilder defensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
        return this;
    }

    public CharacterBuilder positionX(int positionX) {
        this.positionX = positionX;
        return this;
    }

    public CharacterBuilder positionY(int positionY){
        this.positionY = positionY;
        return this;
    }

    public Character createCharacter() {
        return new Character(hp, sp, attack, defensePoints, positionX, positionY);
    }
}