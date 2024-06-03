package command.user;

import command.Command;
import mediator.Room;

public class Attack implements Command {
    private Room room;

    public Attack(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.attack();
    }
}
