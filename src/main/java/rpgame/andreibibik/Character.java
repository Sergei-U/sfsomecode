package rpgame.andreibibik;

import java.util.Random;

public abstract class Character {

    private String name;
    private int healthPoints;
    private int strength;
    private int dexterity;
    private int xp;
    private int level;
    private int gold;

    private int maxHealthPoints;
    private int maxXp = 100;


    public Character(String name, int healthPoints, int strength, int dexterity, int xp, int gold){
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;   //сила
        this.dexterity = dexterity;   // ловкость
        this.xp = xp;
        this.gold = gold;
        this.level = 1;
        this.maxHealthPoints = healthPoints;
    }

    public int attack(){
        if(dexterity * 3 > getRandomValue()) {

            if(new Random().nextInt(10) == 0)
                return strength * 2;
            else
                return strength;

        } else
            return 0;
    }


    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getStrength(){
        return strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getDexterity(){
        return dexterity;
    }

    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }

    public int getXp(){
        return xp;
    }

    public void setXp(int xp){
        this.xp = xp;
    }

    public int getGold(){
        return gold;
    }

    public void setGold(int gold){
        this.gold = gold;
    }

    public void setLevel(int level){
        this.level = level;

    }

    public int getLevel(){
        return level;
    }

    int getRandomValue(){
        return (int) (Math.random() * 100);
    }

    public int getMaxXp(){
        return maxXp;
    }

    public void setMaxXp(int maxXp){
        this.maxXp = maxXp;
    }

    public int getMaxHealthPoints(){
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints){
        this.maxHealthPoints = maxHealthPoints;
    }

    void newLevel(){
        setXp(getXp() + 30);
        setLevel(getLevel() + 1);
        setStrength(getStrength() + 5);
        setDexterity(getDexterity() + 5);
        setGold(getGold() + 50);
        setHealthPoints(getHealthPoints() + 40);
    };



}
