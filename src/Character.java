import java.util.ArrayList;

public abstract class Character {
    int HP;
    int ATK;
    int DEF;
    String name;
    ArrayList<String> buffs;
    ArrayList<String> debufs;

    public Character(int HP, int ATK, int DEF, String name) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.name = name;
    }

    public Character() {
    }
}
