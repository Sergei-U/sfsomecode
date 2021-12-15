package module7.wav.Characters;

public class Paladin extends Character implements Attack, Heal{
    private int holyPower;
    private int power;

    public Paladin(String name, int hp, String weapon, int holyPower, int power) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.holyPower = holyPower;
        this.power = power;
        System.out.println("\nOkay, we are create new character!");


    }

    @Override
    public void greeting() {
        System.out.println("Hello! My name is " + name + " and I'm a Paladin");
    }

    @Override
    public void attack() {
        int hit = 4;
        power -= hit;
        System.out.println(name + " attacking with " + hit + " power points, using " + weapon);
        System.out.println("Now " + name + " has " + power + " power points");
    }

    @Override
    public void heal() {
        int heal = 8;
        holyPower -= heal;
        System.out.println(name + " healing on " + heal + " hp, using " + weapon);
        System.out.println("Now " + name + " has " + holyPower + " mana points");
    }
}
