package command.system;

import command.Command;
import mediator.Room;

public class EnemyTurn implements Command {

    private Room room;

    public EnemyTurn(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.NPCTurn();
    }
}
