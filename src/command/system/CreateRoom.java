package command.system;

import chainOfResponsibility.Chain;
import command.Command;
import generators.NPCFactory;
import mediator.Room;

public class CreateRoom implements Command {
    private Room room;
    Command command;

    public CreateRoom(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.clearEffects();
        room.encounterNPC(NPCFactory.generateNPC());
        if (room.getNpc() == null)
        {
            command = new EmptyRoomMenu(this.room);
        }
        else {
            command = new EncounterMenu(this.room);
        }
        Chain chain = new Chain();
        chain.handle(command);
    }
}
