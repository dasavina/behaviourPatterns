package state;

public class HostileState extends State{
    @Override
    public void spare() {
        System.out.println("you can't spare yet");
    }

    @Override
    public void talk() {
        System.out.println("you try to strike a conversation");
    }

    @Override
    public void battle() {
        System.out.println("...");
    }
}
