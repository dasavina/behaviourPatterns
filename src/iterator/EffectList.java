package iterator;

import characters.Stats;
import templateMethod.Curse;
import templateMethod.Effect;
import templateMethod.Immunity;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EffectList implements Iterator<Effect> {
    private List<Effect> list = new ArrayList<>();
    private Stats stats;
    int index;

    public EffectList(Stats stats) {
        this.stats = stats;
    }

    public void add(Effect effect) {
        if (list.stream().anyMatch(e -> e instanceof Curse) && effect.type) {
            for (Effect e : list) {
                if (e instanceof Curse) {
                    Curse curse = (Curse) e;
                    curse.affect(0);

                    break;
                }
            }
        }
        else if (list.stream().anyMatch(e -> e instanceof Immunity) && !effect.type) {
            for (Effect e : list) {
                if (e instanceof Immunity) {
                    Immunity immunity = (Immunity) e;
                    immunity.affect(0);

                    break;
                }
            }
        }
        else
            {
                list.add(effect);
            }
        }

        @Override
        public boolean hasNext () {
            return (index < list.size());
        }

        @Override
        public Effect next () {
            Effect result = list.get(index++);
            return result;
        }

        @Override
        public void remove () {
            list.remove(index);
        }

        public Stats getStats () {
            return stats;
        }

        public void accept (Visitor visitor){
            Iterator<Effect> iterator = list.iterator();
            while (iterator.hasNext()) {
                visitor = new Visitor(stats);
                Effect effect = iterator.next();
                if (effect.duration == 0)
                {
                    remove();

                }
                stats = effect.accept(visitor);
            }
        }
        public void clear()
        {
            list.clear();
        }
    }
