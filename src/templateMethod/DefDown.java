package templateMethod;

import visitior.EffectVisitor;

public class DefDown extends Effect{
    public DefDown(int duration) {
        super(duration);
        type = false;
    }

    @Override
    public int affect(int DEF) {
        for (int i = 0; i < duration; i++) {
            DEF-= 5;
        }
        duration=0;
        System.out.println("decreased Defence");
        return  DEF;
    }

    @Override
    public void accept(EffectVisitor visitor) {
        visitor.visit(this);
    }


}
