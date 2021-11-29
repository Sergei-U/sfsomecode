package rpgame.andreibibik;

import java.util.Random;

public class Dragon extends Character{
    public Dragon(String name, int healthPoints, int strength, int dexterity, int xp, int gold){
        super(name, healthPoints, strength, dexterity, xp, gold);
    }

    @Override
    public int attack(){
        if(getDexterity() * 3 > getRandomValue()) {

            if(new Random().nextInt(10) == 0){
                System.out.println(getName() + " извергает пламя!");
                return getStrength() * 3;
            } else
                return getStrength();

        } else
            return 0;
    }
}
