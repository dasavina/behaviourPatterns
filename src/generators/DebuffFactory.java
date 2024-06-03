package generators;

import templateMethod.*;

import java.util.Random;

public class DebuffFactory {
    public static Effect generateDebuff() {
        Random random = new Random();
        int choice = random.nextInt(4); // Generates a number between 0 and 3

        switch (choice) {
            case 0:
                return new Bleeding(5);
            case 1:
                return new Curse(3);
            case 2:
                return new AtkDown(10);
            case 3:
                return new DefDown(10);
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
    public static Effect generateDebuff(int parameter, int type) {
        // Generates a number between 0 and 3

        switch (type) {
            case 0:
                return new Bleeding(parameter);
            case 1:
                return new Curse(parameter);
            case 2:
                return new AtkDown(parameter);
            case 3:
                return new DefDown(parameter);
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}