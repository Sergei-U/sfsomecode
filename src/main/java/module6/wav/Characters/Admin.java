package module6.wav.Characters;

public class Admin extends Character {
    final String name;
    final int hp;
    final String weapon;

    public Admin(String name, int hp, String weapon) {
        super();
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
    }



    public void slap () {
        System.out.println(name + " slaps the player with " + weapon);
    }


}
