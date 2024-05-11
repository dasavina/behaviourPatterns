package templateMethod;

import visitior.EffectVisitor;

public class Bleeding extends Effect{
    public Bleeding(int duration) {
        super(duration);
        type=false;
    }
    @Override
    public int affect(int HP) {
            HP -= 8;
        System.out.println("lost health due to bleeding");
        duration--;
        return HP;
    }

    @Override
    public void accept(EffectVisitor visitor) {
        visitor.visit(this);
    }

}
