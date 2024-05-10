package state;

public class NeutralState extends State{

    @Override
    public void spare() {
        System.out.println(" does not understand the reason but appreciates anyways?");
    }

    @Override
    public void talk() {
        System.out.println("You strike a conversation. " +
                "\nYou now know what is going on in the area");
    }

    @Override
    public void battle() {
        System.out.println(" is now aggravated. The battle begins");
    }
}
