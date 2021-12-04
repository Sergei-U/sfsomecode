package module6.m624;

import java.io.Serializable;

public class Monster implements Serializable {
    private String name;
    private int damage;
    private static String testString = "";
    
    public static  void setTestString(String testString){
        Monster.testString = testString;
    }
    
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println(testString + "Monster " + name + " was created");
    }
    
    public void attack(){
       System.out.println(testString + "Monster " + name +  " attacked with damage " + damage);
    }
    
    public void growl(){
       System.out.println(" " + name + " growled" + " " + testString);
    }

}