package command.system;

import command.Command;
import mediator.Room;

public class EndOfTurn implements Command {
    private Room room;

    public EndOfTurn(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.visitEffects();
    }
}
