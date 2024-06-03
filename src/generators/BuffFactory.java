package generators;

import templateMethod.*;

import java.util.Random;

public class BuffFactory {
    public static Effect generateBuff() {
        Random random = new Random();
        int choice = random.nextInt(4); // Generates a number between 0 and 3

        switch (choice) {
            case 0:
                return new Healing(5);
            case 1:
                return new Immunity(3);
            case 2:
                return new AtkUp(10);
            case 3:
                return new DefUp(10);
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
    public static Effect generateBuff(int parameter, int type) {
         // Generates a number between 0 and 3

        switch (type) {
            case 0:
                return new Healing(parameter);
            case 1:
                return new Immunity(parameter);
            case 2:
                return new AtkUp(parameter);
            case 3:
                return new DefUp(parameter);
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}