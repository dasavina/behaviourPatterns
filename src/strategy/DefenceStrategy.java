package strategy;

public class DefenceStrategy implements Strategy{
    @Override
    public void battle(String name) {
        System.out.println("The HP of "+name+" is way higher, as well as DEF, so Defence-based strategy is used");
    }
}
