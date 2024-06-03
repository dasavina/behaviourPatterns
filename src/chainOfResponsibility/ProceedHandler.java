package chainOfResponsibility;

import command.Command;
import command.user.Proceed;

public class ProceedHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Proceed)
        {
            if (((Proceed) command).canProceed())
            {
                command = new CreateNewRoom();
            }
            else
            {
                command = new DisplayEncounterMenu(((Proceed) command).getRoom());
            }
            successor.handleRequest(command);
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }

    }
}
