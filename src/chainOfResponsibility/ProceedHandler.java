package chainOfResponsibility;

import command.Command;
import command.user.Proceed;

public class ProceedHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Proceed)
        {
           command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }

    }
}
