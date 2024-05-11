package state;

public class NeutralState extends State{

    @Override
    public void spare(String name) {
        System.out.println(name+" does not understand the reason but appreciates anyways?");
    }

    @Override
    public void talk() {
        System.out.println("You strike a conversation. " +
                "\nYou now know what is going on in the area");
    }

    @Override
    public void battle(String name) {
        System.out.println(name+" is now aggravated. The battle begins");
    }
}
