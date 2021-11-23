package module14.gelvides;

public class User implements Runnable {
    private String name;
    private int money;
    private String[] slotsArr ;

    public User(String name) {
        this.name = name;
        this.money = 5000;
        slotsArr = Casino.slots.keySet().toArray(new String[0]);
    }

    private void bet(int bet) {
        money += bet;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    @Override
    public void run() {
        String thisSlot;
        while (this.money > 0 && Casino.work.get()) {
                int rand = (int)(0 + Math.random() * slotsArr.length);
                thisSlot = slotsArr[rand];
            int bet = (int) (1 + Math.random() * this.money);
            if (money >= bet) {
                bet(Casino.slots.get(thisSlot).startGame(this, bet));
                for (Casino.Slots slot : Casino.slots.values()) {
                    if (Casino.slots.containsKey(thisSlot)) {
                        System.out.println(this.name + " сделал ставку в " + thisSlot);
                    }
                }
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println();
                }
            }
        }
        try {
            Thread.currentThread().interrupt();
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            if (money > 0) {
                System.out.println(this.name + " покинул казино c заработанными " + this.money);
            } else if (money <= 0) {
                System.out.println(this.name + " проиграл все деньги и покинул казино");
            }
        }
    }
}
