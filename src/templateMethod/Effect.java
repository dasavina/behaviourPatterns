package templateMethod;

import visitior.EffectHandler;

public abstract class Effect {
    boolean type;
    public int duration;

    public Effect(int duration) {
        this.duration = duration;
    }

    public abstract int affect(int parameter);



}
