package command.system;

import chainOfResponsibility.Chain;
import command.Command;
import command.user.Proceed;
import command.user.Save;
import mediator.Room;

import java.util.Scanner;

public class EmptyRoomMenu implements Command {
    private Room room;
    Command command;

    public EmptyRoomMenu(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        command = new EmptyRoomMenu(this.room);
        System.out.println("""
                The room is empty.
                (s) save
                (p) proceed
                """);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input)
        {
            case "s" -> command = new Save(this.room);
            case "p" -> command = new Proceed(this.room);
            default -> System.out.println("no such command");
        }
        Chain chain = new Chain();
        chain.handle(command);
    }
}
