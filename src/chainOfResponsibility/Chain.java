package chainOfResponsibility;

import command.Command;

public class Chain {

    Handler attackHandler = new AttackHandler();
    Handler deathHandler = new DeathHandler();
    Handler fightMenuHandler = new FightMenuHandler();
    Handler enemyTurnHandler = new EnemyTurnHandler();
    Handler emptyRoomMenuHandler = new EmptyRoomMenuHandler();
    Handler encounterMenuHandler = new EncounterMenuHandler();
    Handler endOfTurnHandler = new EndOfTurnHandler();
    Handler newRoomHandler = new NewRoomHandler();
    Handler proceedHandler = new ProceedHandler();
    Handler saveHandler = new SaveHandler();
    Handler spareHandler = new SpareHandler();
    Handler talkHandler = new TalkHandler();
    Handler useBuffHandler = new UseBuffHandler();
    Handler useDebuffHandler = new UseDebuffHandler();

    public Chain() {
        attackHandler.setSuccessor(deathHandler);
        deathHandler.setSuccessor(fightMenuHandler);
        fightMenuHandler.setSuccessor(enemyTurnHandler);
        enemyTurnHandler.setSuccessor(emptyRoomMenuHandler);
        emptyRoomMenuHandler.setSuccessor(encounterMenuHandler);
        encounterMenuHandler.setSuccessor(endOfTurnHandler);
        endOfTurnHandler.setSuccessor(newRoomHandler);
        newRoomHandler.setSuccessor(proceedHandler);
        proceedHandler.setSuccessor(saveHandler);
        saveHandler.setSuccessor(spareHandler);
        spareHandler.setSuccessor(talkHandler);
        talkHandler.setSuccessor(useBuffHandler);
        useBuffHandler.setSuccessor(useDebuffHandler);

    }

    public void handle(Command command)
    {
        attackHandler.handleRequest(command);
    }
}
