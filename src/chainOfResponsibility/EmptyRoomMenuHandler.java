package chainOfResponsibility;

import command.Command;
import command.system.EmptyRoomMenu;
import command.system.EndOfTurn;

public class EmptyRoomMenuHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof EmptyRoomMenu)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
