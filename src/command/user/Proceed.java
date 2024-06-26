package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.CreateRoom;
import command.system.EncounterMenu;
import mediator.Room;

public class Proceed implements Command {
    private Room room;
    Command command;
    public Proceed(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (room.canProceed())
        {
            command = new CreateRoom(this.room);
        }
        else {
            System.out.println("can't proceed");
            command = new EncounterMenu(this.room);
        }
        Chain chain = new Chain();
        chain.handle(command);
    }

}
