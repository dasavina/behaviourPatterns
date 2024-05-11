package characters;

import iterator.EffectList;
import state.State;
import strategy.*;

public class Fightable extends NPC {
    public Stats stats;
    State state;
    public Fightable(int HP, int ATK, int DEF, String name) {

        super(name);
        stats.ATK = ATK;
        stats.HP = HP;
        stats.DEF = DEF;
    }

    public Strategy chooseBattleStrategy(PC enemy) {
        Strategy strategy = new AttackStrategy();
        if (enemy.stats.ATK - stats.DEF <= 5 || stats.HP - enemy.stats.HP >= 100) {
            strategy = new DefenceStrategy();
        }
        if (enemy.stats.ATK - stats.ATK >= 100 || enemy.stats.HP - stats.HP >= 100) {
            strategy = new DebuffStrategy();
        }
        return strategy;
    }
}
