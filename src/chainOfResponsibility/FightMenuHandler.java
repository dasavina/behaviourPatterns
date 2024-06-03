package chainOfResponsibility;

import command.Command;
import command.system.FightMenu;

public class FightMenuHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof FightMenu)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
