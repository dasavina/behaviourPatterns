package visitior;

import templateMethod.*;

public class DefAffectingVisitor implements EffectVisitor{
    int DEF;

    public DefAffectingVisitor(int DEF) {
        this.DEF = DEF;
    }
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

    }

    @Override
    public void visit(Immunity effect) {

    }

    @Override
    public void visit(DefUp effect) {
        effect.affect(DEF);
    }

    @Override
    public void visit(DefDown effect) {
        effect.affect(DEF);
    }
}
