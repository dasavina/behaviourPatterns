package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.EmptyRoomMenu;
import command.system.EncounterMenu;
import mediator.Room;

public class Spare implements Command {
    private Room room;

    public Spare(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.spare();
        Command command = new EncounterMenu(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
