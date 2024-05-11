package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.Bleeding;
import templateMethod.Curse;
import templateMethod.Effect;
import templateMethod.Healing;

public class HPHandler extends Handler{
    @Override
    public int handleRequest(String request, EffectList effects, Stats stats) {

        if (request.equals("Healing")||request.equals("Bleeding")) {
            for (Effect effect : effects.list) {
                if (effect instanceof Bleeding || effect instanceof Healing) {
                    stats.HP = effect.affect(stats.HP);
                    if (effect.duration==0) {effects.remove();}

                }
            }
        } else {
            if (successor != null) {
                successor.handleRequest(request, effects, stats);
            }
        }
        return stats.HP;
    }
}
