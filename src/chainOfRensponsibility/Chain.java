package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.Effect;

import javax.net.ssl.SNIHostName;
import java.util.ArrayList;
import java.util.List;

public class Chain {

    Handler curse = new CurseHandler();
    Handler immunity = new ImmunityHandler();
    Handler HPAffecting = new HPHandler();
    Handler atkAffecting = new ATKHandler();
    Handler defAffecting = new DEFHandler();


    public Chain()
    {
        immunity.successor = curse;
        curse.successor = HPAffecting;
        HPAffecting.successor = atkAffecting;
        atkAffecting.successor = defAffecting;

    }
    public int handle(String request, EffectList effects, Stats stats)
    {
        return immunity.handleRequest(request, effects, stats);
    }


}
