package templateMethod;

import characters.Stats;
import visitor.Visitor;

public class DefDown extends Effect{
    public DefDown(int duration) {
        super(duration);
        type = false;
    }

    @Override
    public int affect(int DEF) {
        for (int i = 0; i < duration; i++) {
            DEF-= 5;
        }
        duration=0;
        System.out.println("decreased Defence");
        return  DEF;
    }

    @Override
    public Stats accept(Visitor visitor) {
        return visitor.visit(this);
    }


}
