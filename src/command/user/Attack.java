package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.EnemyTurn;
import mediator.Room;

public class Attack implements Command {
    private Room room;

    public Attack(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {

        room.attack();
        Command command = new EnemyTurn(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
