package module14.aptem93;

import java.util.concurrent.LinkedBlockingDeque;


public class Main {
    static LinkedBlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

    public static void main(String[] args) throws InterruptedException {

        Thread thread0 = new Thread(new Producer0());
        Thread thread1 = new Thread(new Producer1());
        thread0.start();
        Thread.sleep(180);
        thread1.start();


        thread1.sleep(5000);

        for (Integer threadCount : blockingDeque) {
            System.out.print(threadCount + " ");
        }
    }

    static class Producer0 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if(i % 2 == 0) {
                    try {
                        blockingDeque.offerLast(i);
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Producer1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if(i % 2 != 0) {
                    try {
                        blockingDeque.offerLast(i);
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

