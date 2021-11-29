package rpgame.andreibibik;

public class Battle {

    public void fight(Character hero, Character monster, Main.FightCallback fightCallback){

        Runnable runnable = () -> {
            int move = 1;
            boolean isFightEnded = false;
            while (!isFightEnded) {
                System.out.println("----Ход: " + move + "----");
                if(move % 2 != 0) {
                    isFightEnded = makeHit(monster, hero, fightCallback);
                    move++;
                } else {
                    isFightEnded = makeHit(hero, monster, fightCallback);
                    move++;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

    private Boolean makeHit(Character defender, Character attacker, Main.FightCallback fightCallback){

        int hit = attacker.attack();
        int defenderHealth = defender.getHealthPoints() - hit;

        if(hit != 0) {
            System.out.println(attacker.getName() + " нанес " + hit + " урона");

        } else {
            System.out.println(attacker.getName() + " промахнулся");
        }

        if(defenderHealth <= 0 && defender instanceof Hero) {
            System.out.println("Вы пали смертью храбрых");
            fightCallback.fightLost();
            return true;

        } else if(defenderHealth <= 0) {
            System.out.println("Враг повержен! Вы получаете " + defender.getXp() + " опыта и " + defender.getGold() + " золота");
            attacker.setXp(attacker.getXp() + defender.getXp());
            attacker.setGold(attacker.getGold() + defender.getGold());
            fightCallback.fightWin();
            return true;

        } else {
            defender.setHealthPoints(defenderHealth);
            return false;
        }
    }
}
