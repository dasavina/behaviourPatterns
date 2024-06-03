package chainOfResponsibility;

import command.Command;
import command.system.EncounterMenu;
import command.system.EndOfTurn;

public class EncounterMenuHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof EncounterMenu)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
