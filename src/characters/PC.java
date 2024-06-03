package characters;

public class PC extends Character {
    public PC(String name, Stats stats) {
        super(name, stats);
    }

    public PC(String name) {
        super(name);
        stats.HP = 100;
        stats.DEF = 10;
        stats.ATK = 50;
    }

}
