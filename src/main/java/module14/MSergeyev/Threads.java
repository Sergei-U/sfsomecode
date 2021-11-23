package module14.MSergeyev;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads  {
   public static void main(String[] args) {
       ExecutorService service = Executors.newFixedThreadPool(4);
       for (int i=0; i<8; i ++){
           final int w = i;
           service.execute(new Runnable() {
               @Override
               public void run() {
                   System.out.println(w + " Begin ");
                   try {
                       Thread.sleep(200 + (int) (2000 + Math.random()));

                   }catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("End");
               }
           });
       }service.shutdown();
   }
}
