package characters;

public class PC extends Character {
    public PC(String name, Stats stats) {
        super(name, stats);
    }

    public PC(String name) {
        super(name);
        stats = new Stats(100, 50, 10);
    }

}
