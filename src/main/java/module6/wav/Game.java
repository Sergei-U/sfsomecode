package module6.wav;

import module6.wav.Characters.Admin;
import module6.wav.Characters.Mage;
import module6.wav.Characters.Priest;
import module6.wav.Characters.Warrior;

public class Game {
    public static void main(String[] args) {
        Warrior war1 = new Warrior("Achilles", 150, "Sword", 100, 5);
        war1.attack();
        war1.eat("Хлеб", "Мясо", "Сок");
        Mage mag1 = new Mage("Merlin", 100, "Staff", 150, 5);
        mag1.attack();
        mag1.eat("Вода");
        Priest pr1 = new Priest("Mikhael", 120, "Wand", 120, 3);
        pr1.attack();
        pr1.eat("Вода", "Святой Дух");
        Admin admin = new Admin("Admin", 1000000, "Admin's Wrath");
        admin.slap();

    }
}
