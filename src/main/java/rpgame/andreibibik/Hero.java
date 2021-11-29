package rpgame.andreibibik;

public class Hero extends Character{


    public Hero(String name, int healthPoints, int strength, int dexterity, int xp, int gold){
        super(name, healthPoints, strength, dexterity, xp, gold);

    }

    @Override
    void newLevel(){
            setXp(0);
            setLevel(getLevel() + 1);
            setStrength(getStrength() + 2);
            setDexterity(getDexterity() + 2);
            setMaxHealthPoints(getMaxHealthPoints() + 20);
            setMaxXp(getXp() + 90);
            setHealthPoints(getMaxHealthPoints());
    }




}
