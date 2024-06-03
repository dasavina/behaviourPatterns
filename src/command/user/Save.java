package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.EmptyRoomMenu;
import mediator.Room;

public class Save implements Command {
    private Room room;

    public Save(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.save();
        Command command = new EmptyRoomMenu(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}


