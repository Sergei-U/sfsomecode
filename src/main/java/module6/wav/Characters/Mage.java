package module6.wav.Characters;

public class Mage extends Character {
    public int mana;
    public int hit;

    public Mage(String name, int hp, String weapon, int mana, int hit) {
        super();
        this.mana = mana;
        this.hit = hit;
    }

    @Override
    public void attack() {
        System.out.println("Mage " + name + " have " + mana + " Mana"+ " use " + weapon + " and attacking with dealing magic damage with using " + hit + " mana points");
        mana = mana - hit;
        System.out.println("Now you have " + mana + " mana points");
    }
    public void eat(String water) {
        System.out.println(name + " drinks " + water + " to rest his power");
    }
}

