package command.system;

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
    }
}
