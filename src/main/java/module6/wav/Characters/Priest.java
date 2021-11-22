package module6.wav.Characters;

public class Priest extends Character{
    public int holyEnergy;
    public int heal;

    public Priest(String name, int hp, String weapon, int holyEnergy, int heal) {
        super();
        this.holyEnergy = holyEnergy;
        this.heal = heal;
    }
    @Override
    public void attack() {
        System.out.println("Priest " + name + " have " + holyEnergy + " Holy Energy " + " use " + weapon + " and healing comrade on " + heal*2 + " HP");
        holyEnergy = holyEnergy - heal;
        System.out.println("Now you have " + holyEnergy + " Holy Energy");
    }
    public void eat(String water, String holySpirit) {
        System.out.println(name + " eats " + holySpirit + " and drinks " + water + " to rest his power");
    }
}
