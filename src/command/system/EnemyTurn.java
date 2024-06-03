package command.system;

import chainOfResponsibility.Chain;
import command.Command;
import mediator.Room;

public class EnemyTurn implements Command {

    private Room room;
    Command command;

    public EnemyTurn(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (room.checkDeath(room.getNpc()))
        {
            System.out.println("you won! the next room awaits");
            command = new CreateRoom(this.room);

        }
        else {
            room.NPCTurn();
            command = new EndOfTurn(this.room);
        }
        if (room.checkDeath(room.getPlayer()))
        {
            System.out.println("you died! loading your savepoint");
           command = new Load(this.room);
        }
        Chain chain = new Chain();
        chain.handle(command);
    }
}
