package chainOfResponsibility;

import command.Command;
import command.user.Talk;

public class TalkHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Talk) {
            command.execute();
        } else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
