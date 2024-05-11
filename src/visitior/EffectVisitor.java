package visitior;

import templateMethod.*;

public interface EffectVisitor {
    void visit(Bleeding effect);
    void visit(Healing effect);
    void visit(AtkUp effect);
    void visit(AtkDown effect);
    void visit(Curse effect);
    void visit(Immunity effect);
    void visit(DefUp effect);
    void visit(DefDown effect);
}