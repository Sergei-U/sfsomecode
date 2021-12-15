package module7.wav;

import module7.wav.Characters.Mage;
import module7.wav.Characters.Paladin;
import module7.wav.Characters.Priest;
import module7.wav.Characters.Warrior;

public class Game {
    public static void main(String[] args) {
        Warrior war1 = new Warrior("Achiles", 150, "Sword", 100);
        war1.greeting();
        war1.attack();
        Mage mag1 = new Mage("Merelin", 150, "Staff", 100);
        mag1.greeting();
        mag1.attack();
        Priest pr1 = new Priest("Mikhael", 150, "Wand", 100);
        pr1.greeting();
        pr1.heal();
        Paladin pal1 = new Paladin("Uther", 150, "Hammer", 150, 100);
        pal1.greeting();
        pal1.attack();
        pal1.heal();
    }
}
