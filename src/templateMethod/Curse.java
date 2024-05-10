package templateMethod;

import visitior.EffectHandler;

public class Curse extends Effect {
    public Curse(int duration) {
        super(duration);
        type=false;
    }

    @Override
    public int affect(int numberOfDebuffs) {
        System.out.println("cursed");
        return numberOfDebuffs - 1;
    }


}
