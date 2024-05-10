package characters;

import strategy.*;

public class NPC extends Character {
    public NPC(int HP, int ATK, int DEF, String name) {
        super(HP, ATK, DEF, name);
    }
    String state;

    public Strategy chooseBattleStrategy(PC enemy) {
        Strategy strategy = new AttackStrategy();
        if (enemy.ATK - DEF <= 5 || HP - enemy.HP >= 100) {
            strategy = new DefenceStrategy();
        }
        if (enemy.ATK - ATK >= 100 || enemy.HP - HP >= 100) {
            strategy = new DebuffStrategy();
        }
        return strategy;
    }
}
