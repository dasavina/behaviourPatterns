package chainOfRensponsibility;

import characters.Stats;
import iterator.EffectList;
import templateMethod.Effect;

import java.util.List;

public abstract class Handler {
    Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract int handleRequest(String request, EffectList effects, Stats stats);
}
