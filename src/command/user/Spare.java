package command.user;

import command.Command;
import mediator.Room;

public class Spare implements Command {
    private Room room;

    public Spare(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.save();
    }
}
