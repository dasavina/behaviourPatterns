package chainOfResponsibility;

import command.Command;
import command.system.CreateRoom;
import command.user.Proceed;

public class NewRoomHandler extends Handler{
    @Override
    public void handleRequest(Command command) {
        if (command instanceof CreateRoom)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }

    }
}
