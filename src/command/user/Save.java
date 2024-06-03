package command.user;

import command.Command;
import mediator.Room;

public class Save implements Command {
    private Room room;
    @Override
    public void execute() {
        room.save();
    }
}


