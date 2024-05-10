package templateMethod;

public class Immunity extends Effect {

    public Immunity(int duration) {
        super(duration);
        type = true;
    }

    @Override
    public int affect(int numberOfDebuffs) {
        System.out.println("immune");
        duration= duration-1;
        return numberOfDebuffs-1;
    }

}
