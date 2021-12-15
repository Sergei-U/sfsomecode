package module7.wav.Characters;

public class Warrior extends Character implements Attack{
    public int power;

    public Warrior(String name, int hp, String weapon, int power) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.power = power;
        System.out.println("\nOkay, we are create new character!");


    }

    @Override
    public void greeting() {
        System.out.println("Hello! My name is " + name + " and I'm a Warrior");
    }

    @Override
    public void attack() {
        int hit = 5;
        power -= hit;
        System.out.println(name + " attacking with " + hit + " power points, using " + weapon);
        System.out.println("Now " + name + " has " + power + " power points");
    }
}
