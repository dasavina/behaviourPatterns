package chainOfResponsibility;

import command.Command;
import command.user.UseDebuff;

public class UseDebuffHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof UseDebuff) {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}

