package templateMethod;

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
        System.out.println("increased Defence");
        return  DEF;
    }
}