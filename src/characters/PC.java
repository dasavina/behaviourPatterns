package characters;

public class PC extends Character {

    public PC(int HP, int ATK, int DEF, String name) {
        super(HP, ATK, DEF, name);
    }



    public PC(String name) {
        super(name);
        stats.HP = 100;
        stats.DEF = 10;
        stats.ATK = 50;
    }
}
