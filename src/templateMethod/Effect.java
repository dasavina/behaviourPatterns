package templateMethod;

public abstract class Effect {
    boolean type;
    int duration;

    public Effect(int duration) {
        this.duration = duration;
    }

    public abstract int affect(int parameter);

}
