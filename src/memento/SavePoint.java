package memento;
import characters.PC;
import characters.Stats;

public class SavePoint {
   Stats stats;
    public void save(PC character)
    {
        stats = character.stats;
        System.out.println("Saved stats");
    }
    public void load(PC character)
    {
        character.stats = stats;
        System.out.println("Loaded");
    }
}
