package templateMethod;

import characters.Stats;
import visitor.Visitor;

public class Bleeding extends Effect{
    public Bleeding(int duration) {
        super(duration);
        type=false;
    }
    @Override
    public int affect(int HP) {
            HP -= 10;
        System.out.println("lost health due to bleeding");
        duration--;
        return HP;
    }

    @Override
    public Stats accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
