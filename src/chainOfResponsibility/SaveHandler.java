package chainOfResponsibility;

import command.Command;
import command.user.Save;

public class SaveHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Save) {
            command.execute();
        } else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
