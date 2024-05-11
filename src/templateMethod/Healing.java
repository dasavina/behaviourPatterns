package templateMethod;

public class Healing extends Effect{
    public Healing(int duration) {
        super(duration);
        type=true;
    }

    @Override
    public int affect(int HP) {
            HP += 8;
        System.out.println("healing...");
        duration--;
        return HP;
    }

}
