package templateMethod;

import visitior.EffectHandler;

public class Immunity extends Effect {

    public Immunity(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int numberOfDebuffs) {
        System.out.println("immune");
        return numberOfDebuffs-1;
    }



}
