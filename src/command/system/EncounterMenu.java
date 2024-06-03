package command.system;

import chainOfResponsibility.Chain;
import command.Command;
import command.user.*;
import mediator.Room;

import java.util.Scanner;

public class EncounterMenu implements Command {
    private Room room;
    Command command;

    public EncounterMenu(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        System.out.println("you stumble upon "  + room.getNpc().name);
        System.out.println(room.getNpc().name+ " is in " + room.getNpc().state.getClass().getSimpleName());
        command = new EncounterMenu(this.room);
        System.out.println( room.getPlayer().name +"\n"+ room.getPlayer().stats.toString());
        System.out.println( room.getNpc().name +"\n"+ room.getNpc().stats.toString());



        System.out.println("""
                (f) fight
                (t) talk
                (m) spare
                (p) proceed
                """);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input)
        {
            case "f" -> command = new FightMenu(this.room);
            case "t" -> command = new Talk(this.room);
            case "m" -> command = new Spare(this.room);
            case "p" -> command = new Proceed(this.room);
            default -> System.out.println("no such command");
        }
        Chain chain = new Chain();
        chain.handle(command);
    }
}
