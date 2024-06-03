package chainOfResponsibility;

import command.Command;
import command.system.EnemyTurn;

public class EnemyTurnHandler extends Handler {
    @Override
    public void handleRequest(Command command) {
        if (command instanceof EnemyTurn)
        {
            command.execute();
        }
        else if (successor != null) {
            successor.handleRequest(command);
        }
    }
}
