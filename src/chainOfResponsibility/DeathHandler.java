package chainOfResponsibility;

import command.Command;
import command.system.Load;

public class DeathHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Load)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
