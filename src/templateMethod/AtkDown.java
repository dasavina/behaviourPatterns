package templateMethod;

import visitior.EffectVisitor;

public class AtkDown extends Effect{
    public AtkDown(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int ATK) {
        for (int i = 0; i < duration; i++) {
            ATK-= 10;
        }
        duration = 0;
        System.out.println("decreased attack");
        return  ATK;
    }

    @Override
    public void accept(EffectVisitor visitor) {
        visitor.visit(this);
    }

}
