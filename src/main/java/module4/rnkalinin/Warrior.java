package module4.rnkalinin;

import java.util.Random;

public class Warrior {
    private int health;
    private int damage;
    private int regen;
    private String name;
    private String name2;
    private int lvl;
    private int exp;
    private int healthMax;
    private boolean alive;
    private int currentLvl;
    private int lvlAfterTurn;
    Random rand = new Random();

    public Warrior(String name, String name2) {
        alive = true;
        lvl = 1;
        exp = 0;
        healthMax = 120 + rand.nextInt(20);
        health = healthMax - 10;
        damage = 18 + rand.nextInt(5);
        regen = 4 + rand.nextInt(2);
        this.name = name;
        this.name2 = name2;
    }

    public void receiveDamage(int i) {
        health -= i;
        if (health <= 0) {
            alive = false;
            health = 0;
        }
        Main.logs.append(String.format("%s, у него осталось %d HP>", name2, health));
        if (health == 0) Main.logs.append(String.format("<%s убит!>", name));
    }

    public void upLvl() {
        healthMax += 15;
        health += (healthMax * 0.1);
        regen += 2;
        damage += 3;
        lvl++;
        if (health > healthMax) health = healthMax;
    }

    public void upHealth(int i) {
        health += i;
        if (health > healthMax) health = healthMax;
        Main.logs.append(String.format("HP союзника %s, теперь у него %d HP>", name2, health));
    }

    public int attack() {
        int damageOfCurrentLvl = damage;
        currentLvl = lvl;
        exp += damage;
        health += regen;
        Main.logs.append(String.format("<%s бьёт силой %d ", name, damageOfCurrentLvl));
        if (health > healthMax) health = healthMax;
        if (exp > 30 + (lvl * 10)) {
            exp -= 30 + (lvl * 10);
            upLvl();
            lvlAfterTurn = lvl;
        }
        return damageOfCurrentLvl;
    }

    public void isUpLvl() {
        if (lvlAfterTurn > currentLvl) {
            Main.logs.append(String.format("<%s апнул уровень, теперь у него %d lvl>", name, lvl));
        }
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getRegen() {
        return regen;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public int getLvl() {
        return lvl;
    }

    public boolean isAlive() {
        return alive;
    }
}
