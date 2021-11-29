package rpgame.andreibibik;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Main {

    private static BufferedReader reader;
    private static Character player = null;
    private static Battle battleScene = null;
    private static Seller seller = null;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        battleScene = new Battle();
        seller = new Seller();
        System.out.println("Введите имя персонажа:");
            command(reader.readLine());
    }

    private static void command(String string) throws IOException {
        if (player == null) {
            player = new Hero(string, 100, 11, 20, 0, 0);
            printNavigation();
        }

        switch (string) {
            case "1": {
                seller.sell(player);
                command(reader.readLine());
                break;
            }
            case "2": {
                commitFight();
                break;
            }
            case "3":
                System.exit(1);
                break;
            case "да":
                command("2");
                break;
            case "нет": {
                printNavigation();
                command(reader.readLine());
            }
        }
        command(reader.readLine());
    }

    private static void commitFight() {
        Character monster = createMonster();
                if(player.getLevel() != monster.getLevel()){
                    int levelMonster = 2;
                    while (levelMonster <= player.getLevel()){
                        monster.newLevel();
                        levelMonster++;
                    }
                }



                battleScene.fight(player, createMonster(), new FightCallback() {
            @Override
            public void fightWin() {

                if(player.getXp() >= player.getMaxXp()){
                    player.newLevel();
                    System.out.println("Получен " + player.getLevel() + " уровень!");
                    System.out.println(player.getName() + " победил! Теперь у вас " + player.getGold() + " золота и " + player.getHealthPoints() + " единиц здоровья");
                }
                else
                    System.out.println(player.getName() + " победил! Теперь у вас " + player.getXp() + " единиц опыта, " + player.getGold() + " золота и " + player.getHealthPoints() + " единиц здоровья");

                System.out.println("Желаете продолжить поход или вернуться в город? (да/нет)");
                try {
                    command(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void fightLost() {
                System.exit(1);
            }
        });
    }

    private static void printNavigation() {
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К Торговцу");
        System.out.println("2. В темный лес");
        System.out.println("3. Выход");
    }

    private static Character createMonster() {
        int rand = new Random().nextInt(10);
        if(rand < 4)
            return new Zombie("Зомби", 25, 20, 20, 50, 20);
        else if(rand > 4 && rand < 8)
            return new Skeleton("Скелет", 40, 10, 10, 100, 50);
        else
            return new Dragon("Дракон", 48, 28, 30, 200, 100);
    }

    interface FightCallback {
        void fightWin();
        void fightLost();
    }
}
