package mediator;

import characters.*;
import characters.Character;
import iterator.EffectList;
import memento.SavePoint;
import state.*;
import strategy.*;
import templateMethod.DefUp;
import templateMethod.Effect;
import visitor.Visitor;

public class Room {
    PC player;
    NPC npc;
    SavePoint savePoint;
    EffectList playerEffects = new EffectList(player.stats);
    EffectList npcEffects = new EffectList(npc.stats);

    public Room(PC player) {
        this.player = player;
    }

    public void encounterNPC(NPC npc)
    {
        this.npc = npc;
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
        npc.chooseBattleStrategy(player);
    }
    public void affectNPC(Effect effect)
    {
        npcEffects.add(effect);
    }
    public void affectPlayer(Effect effect)
    {playerEffects.add(effect);}

    public boolean canProceed()
    {
        return (npc == null || npc.state instanceof NeutralState);
    }
    public void save()
    {
        savePoint.save(player);
    }

    public void attack()
    {
        System.out.println(player.stats.ATK-npc.stats.DEF+" damage dealt");
        npc.stats.HP = npc.stats.HP- (player.stats.ATK-npc.stats.DEF);
    }

    public PC getPlayer() {
        return player;
    }

    public NPC getNpc() {
        return npc;
    }
    public void NPCTurn()
    {
        if (npc.strategy instanceof AttackStrategy)
        {
            System.out.println(npc.stats.ATK-player.stats.DEF+" damage dealt");
            player.stats.HP = player.stats.HP- (npc.stats.ATK-player.stats.DEF);
        }
        if (npc.strategy instanceof DebuffStrategy)
        {
            Effect effect = generators.DebuffFactory.generateDebuff();
            affectPlayer(effect);
            effect = generators.BuffFactory.generateBuff();
            affectNPC(effect);
        }
        if (npc.strategy instanceof DefenceStrategy)
        {
            DefUp effect = new DefUp(5);
            affectNPC(effect);
            System.out.println(npc.stats.ATK-player.stats.DEF+" damage dealt");
            player.stats.HP = player.stats.HP- (npc.stats.ATK-player.stats.DEF);

        }
    }
    public boolean checkDeath(Character character)
    {
        return  character.stats.HP<=0;
    }
    public  void load()
    {
        if (checkDeath(player))
        {
            savePoint.load(player);
        }
    }
    public void visitEffects()
    {
        Visitor visitor = new Visitor(npc.stats);
        npcEffects.accept(visitor);
        visitor = new Visitor(player.stats);
        playerEffects.accept(visitor);
    }
}
