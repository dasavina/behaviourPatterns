package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.Immunity;
import templateMethod.Effect;

import java.util.List;

public class ImmunityHandler extends Handler {
    @Override
    public int handleRequest(String request, EffectList effects, Stats stats) {

        if (request.equals("handleImmunity")) {
            for (Effect effect : effects.list) {
                if (effect instanceof Immunity) {
                    Immunity immunity = (Immunity) effect;
                    immunity.affect(0);
                    if (immunity.duration==0) {effects.remove();}
                    return 1;
                }
            }
            return 0;
        } else {
            if (successor != null) {
                successor.handleRequest(request, effects, stats);
            }
        }
        return 0;
    }

}

