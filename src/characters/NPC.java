package characters;

import state.State;
import strategy.*;

public class NPC extends Character {
    public NPC(int HP, int ATK, int DEF, String name) {
        super(HP, ATK, DEF, name);
    }
    State state;

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
