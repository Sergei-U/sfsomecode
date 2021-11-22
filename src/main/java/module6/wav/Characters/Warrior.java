package module6.wav.Characters;

public class Warrior extends Character{
    public int power;
    public int hit;


    public Warrior(String name, int hp, String weapon, int power, int hit) {
        super();
        this.power = power;
        this.hit = hit;

    }
    @Override
    public void attack() {
        System.out.println("Warrior " + name + " have " + power + " Power" + " use " + weapon + " and attacking with " + hit + " power points");
        power = power - 5;
        System.out.println("Now you have " + power + " power points");
    }
    public void eat(String breed, String meat, String juice) {
        System.out.println(name + " eats " + breed + " и " + meat + " and drinks " + juice + " to rest his power");
    }
}
