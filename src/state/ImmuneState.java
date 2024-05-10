package state;

public class ImmuneState extends State{

    @Override
    public void spare() {
        System.out.println(" can't be fought - can't be spared!");
    }

    @Override
    public void talk() {
        System.out.println("You strike a conversation. " +
                "\nYou now know what is going on in the area");
    }

    @Override
    public void battle() {
        System.out.println(" is immune. Means you can't fight this character. Still offensive though");
    }
}
