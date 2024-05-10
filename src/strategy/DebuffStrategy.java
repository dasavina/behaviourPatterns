package strategy;

public class DebuffStrategy implements Strategy{
    @Override
    public void battle(String name) {
        System.out.println("your stats are overall higher than  "+name+", so the Debuff-based strategy is used");
    }
}
