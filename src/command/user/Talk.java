package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.EncounterMenu;
import mediator.Room;

public class Talk implements Command {
    private Room room;

    public Talk(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.talk();

        Command command = new EncounterMenu(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
