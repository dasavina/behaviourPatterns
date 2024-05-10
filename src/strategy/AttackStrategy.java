package strategy;

public class AttackStrategy implements Strategy{

    @Override
    public void battle(String name) {
        System.out.println("As you have high attack, as well as "+name+" , the strategy is Attack-based");
    }
}
