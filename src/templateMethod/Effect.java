package templateMethod;

import observer.Observable;
import characters.Stats;
import observer.Observer;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Effect implements Observable {
    public boolean type;
    public int duration;
    private List<Observer> observers = new ArrayList<>();

    public Effect(int duration) {
        this.duration = duration;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int affect(int parameter);

    public abstract Stats accept(Visitor visitor);
}