package chainOfResponsibility;

public class Chain {

    Handler newRoomHandler = new newRoomHandler();
    Handler noNPCMenu = new NoNpcMenu();
    Handler encounterMenu = new EncounterMenu();
    Handler fightMenu = new FightMenu();
    Handler saveHandler = new SaveHandler();
    Handler proceedHandler = new ProceedHandler();
    Handler talkHandler = new TalkHandler();

    Handler attackHandler = new AttackHandler();
    Handler useBuffHandler = new UseBuffHandler();
    Handler useDebuffHandler = new UseDebuffHandler();
    Handler deathHandler = new DeathHandler();
    Handler enemyTurnHandler = new EnemyTurnHandler();
    Handler endOfTurnHandler = new EndOfTurnHandler();
    Handler spareHandler = new SpareHandler();

    public Handler setChain() {
        newRoomHandler.setSuccessor(noNPCMenu);
        noNPCMenu.setSuccessor(proceedHandler);
        proceedHandler.setSuccessor(saveHandler);
        saveHandler.setSuccessor(encounterMenu);
        encounterMenu.setSuccessor(talkHandler);
        talkHandler.setSuccessor(spareHandler);
        spareHandler.setSuccessor(fightMenu);
        fightMenu.setSuccessor(attackHandler);
        attackHandler.setSuccessor(useBuffHandler);
        useBuffHandler.setSuccessor(useDebuffHandler);
        useDebuffHandler.setSuccessor(enemyTurnHandler);
        enemyTurnHandler.setSuccessor(deathHandler);
        deathHandler.setSuccessor(endOfTurnHandler);

        return newRoomHandler;
    }



}
