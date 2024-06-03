package chainOfResponsibility;

import command.Command;
import command.user.Spare;

public class SpareHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Spare) {
            command.execute();
        } else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
