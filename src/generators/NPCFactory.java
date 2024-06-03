package generators;

import characters.NPC;
import characters.Stats;
import state.*;

import java.util.Random;

public class NPCFactory {
    private static final Random random = new Random();
    private static final String[] NAMES = {"Lesser Dog", "Chimera", "Jubjub Bird", "Goblin", "Forest Guardian"};

    public static NPC generateNPC() {
        if (random.nextInt(4) == 0) {
            return null;
        }

        String name = NAMES[random.nextInt(NAMES.length)];

        int hp = random.nextInt(211) + 90; // 90 to 300
        int atk = random.nextInt(21) + 20; // 20 to 40
        int def = random.nextInt(21);      // 0 to 20

        Stats stats = new Stats(hp, atk, def);

        State state;
        if (random.nextBoolean()) {
            state = new NeutralState();
        } else {
            state = new HostileState();
        }

        return new NPC(name, stats, state);
    }
}