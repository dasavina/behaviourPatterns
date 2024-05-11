package characters;

import state.ImmuneState;
import state.State;

public class NPC extends Character{
    public NPC(String name) {
        super(name);
    }
    public State state = new ImmuneState();
}
