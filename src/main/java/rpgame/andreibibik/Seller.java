package rpgame.andreibibik;

import java.util.Collection;
import java.util.HashMap;


public class Seller {
    private int price;

    void sell(Character hero){
        price = hero.getLevel() * 2 + 30;
        if(price > hero.getGold()) {
            System.out.println("Недостаточно золота");
        } else {
            hero.setHealthPoints(hero.getMaxHealthPoints());
            System.out.println("Здоровье востановлено");
        }
    }

}
