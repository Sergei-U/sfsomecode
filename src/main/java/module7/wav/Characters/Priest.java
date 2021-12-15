package module7.wav.Characters;

public class Priest extends Character implements Heal{
    public int holyPower;

    public Priest(String name, int hp, String weapon, int holyPower) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.holyPower = holyPower;
        System.out.println("\nOkay, we are create new character!");


    }

    @Override
    public void greeting() {
        System.out.println("Hello! My name is " + name + " and I'm a Priest");
    }

    @Override
    public void heal() {
        int heal = 10;
        holyPower -= heal;
        System.out.println(name + " healing on " + heal + " hp, using " + weapon);
        System.out.println("Now " + name + " has " + holyPower + " mana points");
    }
}
