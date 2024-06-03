package command.system;

import chainOfResponsibility.Chain;
import command.Command;
import mediator.Room;

public class Load implements Command {
    private Room room;

    public Load(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {

        room.load();
        Command command = new CreateRoom(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
