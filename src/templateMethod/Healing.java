package templateMethod;

import characters.Stats;
import visitor.Visitor;

public class Healing extends Effect{
    public Healing(int duration) {
        super(duration);
        type=true;
    }

    @Override
    public int affect(int HP) {
            HP += 10;
        System.out.println("healing...");
        duration--;
        return HP;
    }

    @Override
    public Stats accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
