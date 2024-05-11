package characters;

public abstract class Character {
    public Stats stats;
    public String name;

    public Character(int HP, int ATK, int DEF, String name) {
        stats = new Stats(HP, ATK, DEF);
        this.name = name;
    }

    public Character(String name) {
        this.name = name;
    }
}
