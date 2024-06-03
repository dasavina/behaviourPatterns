package command.user;

import command.Command;
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
    }
}
