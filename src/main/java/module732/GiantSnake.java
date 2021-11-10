package main.java.module732;

public class GiantSnake extends Monster implements Fighter{
    
    public static String scream = "Ssssss";
    
    public GiantSnake(String name) {
        super(name + " the GiantSnake",5);
    }

    @Override
    public void attack(Entity entity) {
        entity.damage(getForce());
        growl();
    }


    public void growl(){
        System.out.println(scream);
    }


    @Override
    public void attack(Monster monster) {

    }
}