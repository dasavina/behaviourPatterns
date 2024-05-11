package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.*;

public class ATKHandler extends Handler{

    @Override
    public int handleRequest(String request, EffectList effects, Stats stats) {

        if (request.equals("AtkUp") || request.equals("AtkDown")) {
            for (Effect effect : effects.list) {
                if (effect instanceof AtkUp || effect instanceof AtkDown) {
                    stats.ATK = effect.affect(stats.ATK);
                    if (effect.duration==0) {effects.remove();}

                }
            }
        } else {
            if (successor != null) {
                successor.handleRequest(request, effects, stats);
            }
        }
        return stats.ATK;
    }
}
