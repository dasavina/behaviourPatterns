package visitior;

import templateMethod.*;

public class AffectingVisitor implements EffectVisitor{
    @Override
    public void visit(Bleeding effect) {

    }

    @Override
    public void visit(Healing effect) {

    }

    @Override
    public void visit(AtkUp effect) {

    }

    @Override
    public void visit(AtkDown effect) {

    }

    @Override
    public void visit(Curse effect) {
        effect.affect(0);
    }

    @Override
    public void visit(Immunity effect) {
        effect.affect(0);
    }

    @Override
    public void visit(DefUp effect) {

    }

    @Override
    public void visit(DefDown effect) {

    }
}
