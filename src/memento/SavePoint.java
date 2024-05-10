package memento;
import characters.PC;
public class SavePoint {
    int HP;
    int ATK;
    int DEF;
    public void save(PC character)
    {
        HP = character.HP;
        ATK = character.ATK;
        DEF = character.DEF;
        System.out.println("Saved stats");
    }
    public void load(PC character)
    {
        character.HP = HP;
        character.ATK = ATK;
        character.DEF = DEF;
        System.out.println("Loaded");
    }
}
