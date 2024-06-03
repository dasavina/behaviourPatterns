package observer;

import templateMethod.Effect;

import java.util.List;

class EffectObserver implements Observer {
    private List<Effect> effects;

    public EffectObserver(List<Effect> effects) {
        this.effects = effects;
    }

    @Override
    public void update(Effect effect) {
        effects.remove(effect);
        System.out.println("Effect expired: " + effect);
    }
}
