package module14.Safarkhan;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {


   static Queue queue = new ArrayDeque();

   static class Upload extends Thread {
       private static final Object lock = new Object();
       int i;

       public Upload(int i){
           this.i = i;
       }

       public void addQ() {
           synchronized (lock) {
               queue.add(i + " поток добавил элемент");
           }
       }

       public void run() {
           addQ();
       }
   }


   public static void main(String[] args) throws InterruptedException {


       Thread asd = new Upload(1);
       Thread dsa = new Upload(2);
       asd.start();
       dsa.start();
       asd.join();
       dsa.join();

       System.out.println(queue);
   }
}

