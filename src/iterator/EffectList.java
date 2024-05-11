package iterator;

import chainOfRensponsibility.Chain;
import characters.Character;
import characters.Stats;
import templateMethod.Effect;

import java.util.Iterator;
import java.util.List;

public class EffectList implements Iterator<Effect> {
    public List<Effect> list;
    Chain chain = new Chain();
    int currentIndex = 0;

    Character character;
    public EffectList(Character character) {
        this.character = character;
    }
    public void add(Effect effect)
    {
        if (chain.handle("handleCurse", this, new Stats(0,0,0))==0 && effect.type
                || chain.handle("handleImmunity", this, new Stats(0,0,0))==0 && !effect.type)
        {
            list.add(effect);
        }
    }


    @Override
    public boolean hasNext() {
        return (currentIndex < list.size());
    }

    @Override
    public Effect next() {
        Effect result = list.get(currentIndex++);
        chain.handle(result.getClass().getName(), this, character.stats);
        return result;

    }

    @Override
    public void remove() {
        list.remove(--currentIndex);
    }

}

