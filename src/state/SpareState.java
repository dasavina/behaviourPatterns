package state;

public class SpareState extends State{
    @Override
    public void spare(String name) {
        System.out.println(name +" was spared");
    }

    @Override
    public void talk() {
        System.out.println(" You are asked to spare");
    }

    @Override
    public void battle(String name) {
        System.out.println(name+" is disappointed. the chance is lost.");
    }
}
