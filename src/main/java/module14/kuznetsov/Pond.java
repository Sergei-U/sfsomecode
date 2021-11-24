package module14.kuznetsov;

import java.util.concurrent.atomic.AtomicInteger;

public class Pond {

    private final AtomicInteger waterLevel; // current water level in liters

    public Pond(int waterVolume) {
        this.waterLevel = new AtomicInteger(waterVolume);
    }

    class Pump extends Thread {

        private final int passability; // per 1 sec
        private final String inOut; // pumping in / pumping out

        public Pump(String inOut, int passability) {
            this.passability = passability;
            this.inOut = inOut;
        }

        public void pumpWater() {
            if (inOut.equals("out")) {
                waterLevel.addAndGet(-passability);
                if (waterLevel.get() <= 0) {
                    waterLevel.set(0);
                }
            } else if (inOut.equals("in")) {
                if (waterLevel.get() + passability > 50) {
                    waterLevel.set(50);
                } else waterLevel.addAndGet(passability);
            }
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                pumpWater();
                if (waterLevel.get() == 0) {
                    System.out.println("Pond is empty, interrupting pumping out");
                    interrupt();
                }
                if (waterLevel.get() == 50) {
                    System.out.println("Pond is full, interrupting pumping in");
                    interrupt();
                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupting");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Pond pond = new Pond(25);
        Pond.Pump pump1 = pond.new Pump("out", 5);
        Pond.Pump pump2 = pond.new Pump("in", 10);

        pump1.start();
        pump2.start();

        // demonstration
        while (!pump1.isInterrupted() && !pump2.isInterrupted()) {
            System.out.println("Water level is " + pond.waterLevel.get());
            Thread.sleep(1000);
        }
    }
}
