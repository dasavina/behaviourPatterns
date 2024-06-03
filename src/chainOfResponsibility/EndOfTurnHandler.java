package chainOfResponsibility;

import command.Command;
import command.system.EndOfTurn;


public class EndOfTurnHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof EndOfTurn)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
