package characters;

public abstract class Character {
    public String name;
    public Stats stats;

    public Character(String name, Stats stats) {
        this.name = name;
        this.stats = stats;
    }

    public Character(String name) {
        this.name = name;
    }


}
