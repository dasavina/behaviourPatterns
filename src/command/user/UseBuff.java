package command.user;

import chainOfResponsibility.Chain;
import command.Command;
import command.system.EncounterMenu;
import command.system.EnemyTurn;
import generators.BuffFactory;
import mediator.Room;
import templateMethod.Effect;

public class UseBuff implements Command {
    private Room room;

    public UseBuff(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        Effect effect = BuffFactory.generateBuff();
        room.affectPlayer(effect);
        System.out.println("player is affected by "+ effect.getClass().getSimpleName());

        Command command = new EnemyTurn(this.room);
        Chain chain = new Chain();
        chain.handle(command);
    }
}
