package chainOfResponsibility;

import command.Command;
import command.user.Fight;

public class BattleHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Fight)
        {
            command.execute();
        }else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
