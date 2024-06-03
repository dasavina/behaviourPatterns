package chainOfResponsibility;

import command.user.Attack;
import command.Command;

public class AttackHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof Attack)
        {
            command.execute();
        }else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
