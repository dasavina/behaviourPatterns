package command.system;

import chainOfResponsibility.Chain;
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
        Command command = new EncounterMenu(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
