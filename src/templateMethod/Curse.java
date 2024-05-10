package templateMethod;

public class Curse extends Effect {
    public Curse(int duration) {
        super(duration);
        type=false;
    }

    @Override
    public int affect(int numberOfDebuffs) {
        System.out.println("cursed");
        duration = duration - 1;
        return numberOfDebuffs - 1;
    }
}
