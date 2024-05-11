package mediator;

import characters.*;
import characters.Character;
import iterator.EffectList;
import state.HostileState;
import state.NeutralState;
import state.SpareState;
import strategy.Strategy;
import templateMethod.Effect;

public class Interaction {
    PC player;
    NPC npc;
    Fightable enemy;
    EffectList playerEffects = new EffectList(player.stats);
    EffectList npcEffects = new EffectList(enemy.stats);

    public Interaction(PC player) {
        this.player = player;
    }

    public void encounterNPC(Fightable fightable)
    {
        this.npc = fightable;
        enemy = fightable;
    }
    public void encounterVendor(NPC NPC)
    {
        this.npc = NPC;
    }

    public void talk()

    {
        npc.state.talk();
        if (npc.state instanceof HostileState)
        {npc.state = new SpareState();}
    }
    public void spare()
    {
        npc.state.spare(npc.name);
        if (npc.state instanceof SpareState)
        {npc.state = new NeutralState();
        }
    }
    public void battle()
    {
        npc.state.battle(npc.name);
        npc.state = new HostileState();
    }
    public void strategyChoice()
    {
        Strategy strategy = enemy.chooseBattleStrategy(player);
    }
    public void affectNPC(Effect effect)
    {
        npcEffects.add(effect);
    }
    public void afectPlayer(Effect effect)
    {playerEffects.add(effect);}
}
