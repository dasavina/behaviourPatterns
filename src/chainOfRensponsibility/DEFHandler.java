package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.*;

public class DEFHandler extends Handler{

    @Override
    public int handleRequest(String request, EffectList effects, Stats stats) {

        if (request.equals("DefUp")||request.equals("DefDown")) {
            for (Effect effect : effects.list) {
                if (effect instanceof DefDown || effect instanceof DefUp) {
                    stats.DEF = effect.affect(stats.DEF);
                    if (effect.duration==0) {effects.remove();}

                }
            }
        } else {
            if (successor != null) {
                successor.handleRequest(request, effects, stats);
            }
        }
        return stats.DEF;
    }
}
