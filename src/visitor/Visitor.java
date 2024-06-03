package visitor;

import characters.Stats;
import templateMethod.*;

public class Visitor implements EffectVisitor{
   Stats stats;

    public Visitor(Stats stats) {
        this.stats = stats;
    }

    @Override
    public Stats visit(Curse effect) {

        return stats;
    }

    @Override
    public Stats visit(Immunity effect) {

        return stats;
    }

    @Override
    public Stats visit(AtkUp effect) {
        stats.ATK = effect.affect(stats.ATK);
        return stats;
    }

    @Override
    public Stats visit(AtkDown effect) {
        stats.ATK = effect.affect(stats.ATK);
        return stats;
    }

    @Override
    public Stats visit(DefUp effect) {
        stats.DEF = effect.affect(stats.DEF);
        return stats;
    }

    @Override
    public Stats visit(DefDown effect) {
        stats.DEF = effect.affect(stats.DEF);
        return stats;
    }

    @Override
    public Stats visit(Bleeding effect) {
        stats.HP =effect.affect(stats.HP);
        return stats;
    }

    @Override
    public Stats visit(Healing effect) {
        stats.HP =effect.affect(stats.HP);
        return stats;
    }
}
