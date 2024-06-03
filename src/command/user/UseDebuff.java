package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.EnemyTurn;
import generators.DebuffFactory;
import mediator.Room;
import templateMethod.Effect;

public class UseDebuff implements Command {
    private Room room;

    public UseDebuff(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        Effect effect = DebuffFactory.generateDebuff();
        room.affectNPC(effect);
        System.out.println("enemy is affected by "+effect.getClass().getSimpleName());
        Command command = new EnemyTurn(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
