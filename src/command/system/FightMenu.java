package command.system;

import chainOfResponsibility.Chain;
import command.Command;
import command.user.*;
import mediator.Room;

import java.util.Scanner;

public class FightMenu implements Command {
    private Room room;
    Command command;

    public FightMenu(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.battle();
        command = new FightMenu(this.room);
        System.out.println("""
                (a) attack
                (b) apply buff to self
                (d) apply debuff to the enemy
                """);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input)
        {
            case "a" -> command = new Attack(this.room);
            case "b" -> command = new UseBuff(this.room);
            case "d" -> command = new UseDebuff(this.room);
            default -> System.out.println("no such command");
        }
        Chain chain = new Chain();
        chain.handle(command);
    }
}
