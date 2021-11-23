package module14.gelvides;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Casino extends Thread  {
    public static Map<String, Slots> slots = new ConcurrentHashMap<>();
    public static AtomicBoolean work = new AtomicBoolean(true);
    protected static AtomicInteger casinoBank = new AtomicInteger(10000);
    private int workTime = 60000;
    private long startTimeWork;

    public Casino() {
        slots.put("RedDragon", new Slots("RedDragon"));
        slots.put("LazyMonkey", new Slots("LazyMonkey"));
        slots.put("AquaFly", new Slots("AquaFly"));
        this.startTimeWork = System.currentTimeMillis();
    }

    @Override
    public void run() {
        for (Slots slot : slots.values()) {
            slot.start();
        }
        while (work.get()) {
            long time = System.currentTimeMillis();
            if (time >= (this.startTimeWork + this.workTime)) {
                System.out.println("Команда на остановку слотов выполнена");
                work.set(false);
                for (Slots slot : slots.values()) {
                    try {
                        slot.interrupt();
                        slot.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        for (Slots slot : slots.values()) {
            try {
                slot.interrupt();
                slot.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Банк казино: " + casinoBank.get());
    }


    class Slots extends Thread {
        private String name;
        private User user;

        public Slots(String name) {
            this.name = name;
        }

        public int startGame(User user, int bet) {
            this.user = user;
            synchronized (user) {
                double winner = Math.random();
                if (winner >= 0.3) {
                    if (Casino.casinoBank.get() < bet * 2) {
                        return Casino.casinoBank.getAndSet(0);
                    } else if (Casino.casinoBank.get() > bet * 2) {
                        Casino.casinoBank.addAndGet(-(bet * 2));
                        return bet * 2;
                    }
                } else
                    Casino.casinoBank.addAndGet(bet);
                return -bet;
            }
        }

        public String getSlotName() {
            return this.name;
        }


        public void run() {
            while (!isInterrupted() && Casino.work.get()) {
            /*
            Непонятно почему поток отрабатывает 3 раза при условии, что банк
            казино оказался пустым. Помогите пожалуйста исправить. В коде намеренно стоит
            высокий % победы.
             */
                if (Casino.casinoBank.get() < 1) {
                    System.out.println("Кажется игроку \"" + user.getName() + "\" очень повезло и он выйграл все деньги в казино.");
                    Casino.work.set(false);
                    break;
                }
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

