package visitior;

import templateMethod.Effect;

public interface EffectHandler {
    public void handleTurnByTurn(Effect effect);
    public void handleInstant(Effect effect);
    public void handleAffecting(Effect effect);
}
