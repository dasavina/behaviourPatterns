package characters;

import state.ImmuneState;
import state.State;

public class Vendor extends Character{
    public Vendor(int HP, int ATK, int DEF, String name) {
        super(HP, ATK, DEF, name);
    }
    State state = new ImmuneState();
}
