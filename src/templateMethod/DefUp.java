package templateMethod;

import characters.Stats;
import visitor.Visitor;

public class DefUp extends Effect{
    public DefUp(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int DEF) {
        for (int i = 0; i < duration; i++) {
            DEF+= 5;
        }
        duration =0;
        System.out.println("increased Defence");
        return  DEF;
    }

    @Override
    public Stats accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
