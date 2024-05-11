package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.Curse;
import templateMethod.Effect;

import java.util.List;

public class CurseHandler extends Handler {
    @Override
    public int handleRequest(String request, EffectList effects, Stats stats) {

        if (request.equals("handleCurse")) {
            for (Effect effect : effects.list) {
                if (effect instanceof Curse) {
                    Curse curse = (Curse) effect;
                    curse.affect(0);
                    if (curse.duration==0) {effects.remove();}
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

