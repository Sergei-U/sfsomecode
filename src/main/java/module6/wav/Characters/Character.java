package module6.wav.Characters;

public class Character {
    public String name;
    public int hp;
    public String weapon;

    public Character() {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        System.out.println("Character is created");
    }


    public void attack() {
        System.out.println(name + "attacking");
    }
    public void eat(String food) {
        System.out.println("Character eats " + food);

    }
}
