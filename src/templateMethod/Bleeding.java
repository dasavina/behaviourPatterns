package templateMethod;

public class Bleeding extends Effect{
    public Bleeding(int duration) {
        super(duration);
        type=false;
    }
    @Override
    public int affect(int HP) {
            HP -= 8;
        System.out.println("lost health due to bleeding");
        return HP;
    }
}
