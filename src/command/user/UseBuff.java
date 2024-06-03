package command.user;

import command.Command;
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
    }
}
