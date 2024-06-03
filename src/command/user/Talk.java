package command.user;

import command.Command;
import mediator.Room;

public class Talk implements Command {
    private Room room;

    public Talk(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.talk();
    }
}
