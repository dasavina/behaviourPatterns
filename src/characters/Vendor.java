package characters;

import state.ImmuneState;
import state.State;

public class Vendor extends Character{
    public Vendor(String name) {
        super(name);
    }
    State state = new ImmuneState();
}
