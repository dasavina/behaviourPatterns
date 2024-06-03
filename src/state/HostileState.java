package state;

public class HostileState extends State{
    @Override
    public void spare(String name) {
        System.out.println(name+" can't be spared yet");
    }

    @Override
    public void talk() {
        System.out.println("you try to strike a conversation. your opponent lost interest in a fight");
    }

    @Override
    public void battle(String name) {
        System.out.println(name+" prepares for the next move");
    }
}
