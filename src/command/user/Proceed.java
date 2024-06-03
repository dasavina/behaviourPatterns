package command.user;

import characters.PC;
import command.Command;
import mediator.Room;

public class Proceed implements Command {
    private Room room;

    public Proceed(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (canProceed())
        {

        }
        else {
            
        }
    }
    public boolean canProceed()
    {
        return room.canProceed();
    }


    public Room getRoom() {
        return room;
    }
}
