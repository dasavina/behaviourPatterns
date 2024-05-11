package characters;

public class Stats {
    public int HP;
    public int ATK;
    public int DEF;

    public Stats(int HP, int ATK, int DEF) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "HP=" + HP +
                ", ATK=" + ATK +
                ", DEF=" + DEF +
                '}';
    }
}
