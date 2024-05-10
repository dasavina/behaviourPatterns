package characters;

public class PC extends Character {

    public PC(int HP, int ATK, int DEF, String name) {
        super(HP, ATK, DEF, name);
    }

    public PC(String name) {
        HP = 100;
        DEF = 10;
        ATK = 50;
        this.name = name;
    }
}
