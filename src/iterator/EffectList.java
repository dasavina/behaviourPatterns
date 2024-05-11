package iterator;

import characters.Stats;
import templateMethod.Effect;
import visitior.EffectVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EffectList implements Iterator<Effect> {
    public List<Effect> list = new ArrayList<>();
    int currentIndex = 0;

    Stats stats;

    public EffectList(Stats stats) {
        this.stats = stats;
    }

    public void add(Effect effect) {
        list.add(effect);
    }

    @Override
    public boolean hasNext() {
        return (currentIndex < list.size());
    }

    @Override
    public Effect next() {
        Effect result = list.get(currentIndex++);
        return result;
    }

    @Override
    public void remove() {
        list.remove(--currentIndex);
    }

    public Stats getStats() {
        return stats;
    }

    public void accept(EffectVisitor visitor) {
        for (Effect effect : list) {
            effect.accept(visitor);
        }
    }
}
