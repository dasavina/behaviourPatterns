package state;

public class ImmuneState extends State{

    @Override
    public void spare(String name) {
        System.out.println(name+" can't be fought - can't be spared! Appreciates the gesture, though");
    }

    @Override
    public void talk() {
        System.out.println("You strike a conversation. " +
                "\nYou now know what is going on in the area");
    }

    @Override
    public void battle(String name) {
        System.out.println(name+" is immune. Means you can't fight this character. Still offensive though");
    }
}
