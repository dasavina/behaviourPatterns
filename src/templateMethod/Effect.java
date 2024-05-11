package templateMethod;

import visitior.EffectVisitor;

public abstract class Effect {
    public boolean type;
    public int duration;

    public Effect(int duration) {
        this.duration = duration;
    }

    public abstract int affect(int parameter);
    public abstract void accept(EffectVisitor visitor);
}