package templateMethod;

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



}
