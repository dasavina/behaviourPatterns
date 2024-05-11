package characters;

public class PC extends Character {
    public Stats stats;
    public PC(int HP, int ATK, int DEF, String name) {

        super(name);
        stats.ATK = ATK;
        stats.HP = HP;
        stats.DEF = DEF;
    }



    public PC(String name) {
        super(name);
        stats.HP = 100;
        stats.DEF = 10;
        stats.ATK = 50;
    }
}
