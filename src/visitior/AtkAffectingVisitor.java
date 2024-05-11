package visitior;

import templateMethod.*;

public class AtkAffectingVisitor implements EffectVisitor{

    int ATK;

    public AtkAffectingVisitor(int ATK) {
        this.ATK = ATK;
    }


    @Override
    public void visit(Bleeding effect) {

    }

    @Override
    public void visit(Healing effect) {

    }

    @Override
    public void visit(AtkUp effect) {
        effect.affect(ATK);
    }

    @Override
    public void visit(AtkDown effect) {
        effect.affect(ATK);
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
