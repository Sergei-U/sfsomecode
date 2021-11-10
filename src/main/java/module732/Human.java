package main.java.module732;

public class Human extends Monster implements Fighter{
    
    public Human(String name) {
        super(name + " the Man",5);
    }

    @Override
    public void attack(Monster monster) {
        monster.damage(getForce());

    }


    @Override
    public void attack(Entity m){
        m.damage(1);
    }
    
}