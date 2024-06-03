package command.user;

import command.Command;
import mediator.Room;

public class Fight implements Command {
    private Room room;

    public Fight(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.battle();
    }
}
