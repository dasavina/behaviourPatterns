package visitior;

import templateMethod.*;

public class HPAffectingVisitor implements EffectVisitor{
    int HP;

    public HPAffectingVisitor(int HP) {
        this.HP = HP;
    }


    @Override
    public void visit(Bleeding effect) {
        effect.affect(HP);
    }

    @Override
    public void visit(Healing effect) {
        effect.affect(HP);
    }

    @Override
    public void visit(AtkUp effect) {

    }

    @Override
    public void visit(AtkDown effect) {

    }

    @Override
    public void visit(Curse effect) {

    }

    @Override
    public void visit(Immunity effect) {

    }

    @Override
    public void visit(DefUp effect) {

    }

    @Override
    public void visit(DefDown effect) {

    }
}
