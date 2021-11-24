package module13.HexRuin;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    static ArrayList<Runner> runners = new ArrayList<>();

    public static void main(String[] args) {

        runners.add(new Runner("Runner1"));
        runners.add(new Runner("Runner2"));
        runners.add(new Runner("Runner3"));
        runners.add(new Runner("Runner4"));
        runners.add(new Runner("Runner5"));

        for (Runner runner : runners) {
            runner.start();
        }

        while (true) {
            if (checkWinner()) {
                runnersStop();
                printResult();
                return;
            }
        }
    }

    public static boolean checkWinner() {
        return !runners.get(0).isAlive() ||
                !runners.get(1).isAlive() ||
                !runners.get(2).isAlive() ||
                !runners.get(3).isAlive() ||
                !runners.get(4).isAlive();
    }

    public static void runnersStop() {
        for (Runner runner : runners) {
            runner.interrupt();
            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printResult() {
        TreeSet<Runner> treeRunners = new TreeSet<>(runners);
        for (Runner runner : treeRunners) {
            System.out.println(runner);
        }
    }
}


class Runner extends Thread implements Comparable<Runner> {
    int value;

    public Runner(String name) {
        super(name);
        value = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            value++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                return;
            }
        }
    }


    @Override
    public int compareTo(Runner anotherRunner) {
        return value - anotherRunner.value;
    }

    @Override
    public String toString() {
        return this.getName() + " --- " + value;
    }
}

