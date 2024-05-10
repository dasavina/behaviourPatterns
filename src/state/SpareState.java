package state;

public class SpareState extends State{
    @Override
    public void spare() {
        System.out.println(" was spared");
    }

    @Override
    public void talk() {
        System.out.println(" does not want to fight anymore and asks you to spare");
    }

    @Override
    public void battle() {
        System.out.println(" is disappointed. the chance is lost.");
    }
}
