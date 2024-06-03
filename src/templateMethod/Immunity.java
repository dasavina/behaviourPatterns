package templateMethod;

import characters.Stats;
import observer.Observer;
import visitor.Visitor;

public class Immunity extends Effect {

    public Immunity(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int num) {
        System.out.println("immune");
        duration--;
        return num;
    }

    @Override
    public Stats accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addObserver(Observer observer) {
        super.addObserver(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        super.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}
