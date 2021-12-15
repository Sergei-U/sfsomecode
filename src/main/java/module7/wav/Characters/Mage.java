package module7.wav.Characters;

public class Mage extends Character implements Attack{
    private int mana;

    public Mage(String name, int hp, String weapon, int mana) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.mana = mana;
        System.out.println("\nOkay, we are create new character!");


    }

    @Override
    public void greeting() {
        System.out.println("Hello! My name is " + name + " and I'm a Mage");
    }

    @Override
    public void attack() {
        int hit = 7;
        mana -= hit;
        System.out.println(name + " attacking with " + hit + " mana points, using " + weapon);
        System.out.println("Now " + name + " has " + mana + " mana points");
    }
}
