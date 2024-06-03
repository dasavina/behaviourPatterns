package chainOfResponsibility;

import command.Command;
import command.user.UseBuff;

public class UseBuffHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof UseBuff) {
            command.execute();
        } else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
