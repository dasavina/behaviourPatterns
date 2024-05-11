package templateMethod;

public class Curse extends Effect {
    public Curse(int duration) {
        super(duration);
        type=false;
    }

    @Override
    public int affect(int num) {
        System.out.println("cursed");
        duration --;
        return duration;
    }


}
