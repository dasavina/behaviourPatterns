package templateMethod;

import visitior.EffectVisitor;

public class AtkUp extends Effect{
    public AtkUp(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int ATK) {
        for (int i = 0; i < duration; i++) {
            ATK+= 10;
        }
        duration =0;
        System.out.println("increased attack");
        return  ATK;
    }

    @Override
    public void accept(EffectVisitor visitor) {
        visitor.visit(this);
    }

}
