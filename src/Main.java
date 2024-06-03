import chainOfResponsibility.Chain;
import characters.PC;
import command.Command;
import command.system.CreateRoom;
import command.system.EmptyRoomMenu;
import mediator.Room;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("name the player");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        PC player = new PC(name);
        Room room = new Room(player);
        Command command = new CreateRoom(room);
        Chain chain = new Chain();
        chain.handle(command);

        System.out.println("---------------------------");
        room.encounterNPC(null);
        command = new EmptyRoomMenu(room);
        chain.handle(command);
    }


}