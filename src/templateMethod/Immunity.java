package templateMethod;

import visitior.EffectVisitor;

public class Immunity extends Effect {

    public Immunity(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int num) {
        System.out.println("immune");
        duration--;
        return num;
    }

    @Override
    public void accept(EffectVisitor visitor) {
        visitor.visit(this);
    }


}
