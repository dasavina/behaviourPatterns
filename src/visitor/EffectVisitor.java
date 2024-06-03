package visitor;

import characters.Stats;
import templateMethod.*;

public interface EffectVisitor {
    Stats visit(Bleeding effect);
    Stats visit(Healing effect);
    Stats visit(AtkUp effect);
    Stats visit(AtkDown effect);
    Stats visit(Curse effect);
    Stats visit(Immunity effect);
    Stats visit(DefUp effect);
    Stats visit(DefDown effect);
}