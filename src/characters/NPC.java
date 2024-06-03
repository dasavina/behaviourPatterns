package characters;

import state.State;
import strategy.*;

public class NPC extends Character{
    public State state;
    public Strategy strategy;
    public NPC(String name, Stats stats, State state) {
        super(name, stats);
        this.state = state;
    }

    public Strategy chooseBattleStrategy(PC enemy) {
        strategy = new AttackStrategy();
        if (enemy.stats.ATK - stats.DEF <= 5 || stats.HP - enemy.stats.HP >= 100) {
            strategy = new DefenceStrategy();
        }
        if (enemy.stats.ATK - stats.ATK >= 100 || enemy.stats.HP - stats.HP >= 100) {
            strategy = new DebuffStrategy();
        }
        return strategy;
    }
}
