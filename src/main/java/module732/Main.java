package module732;

public class Main {


    public static void main(String[] args) {
/*

Make class Entity - the superclass for all entities
Fix class Zombie and ...

*/

        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Human("Vasiliy"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new Tower("Big Ben"));

        battle.start();

       
/* 

                       ...and The GreatBattle starts!

*/
    }

}
