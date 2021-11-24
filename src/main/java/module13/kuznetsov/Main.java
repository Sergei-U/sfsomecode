package module13.kuznetsov;

import java.util.Scanner;

public class Main {
   // запустить поток, который перебирает числа от 0 до n
   // остановить поток на заданном числе

   static int numberA;
   static int numberB;

   static Thread numbersIteration = new Thread() {
       @Override
       public void run() {
           while (!isInterrupted()) {
               if (numberA == numberB) {
                   this.interrupt();
               } else numberA++;
           }
       }
   };

   static void introduction() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input number you want to stop Thread at: ");
       numberB = sc.nextInt();
   }

   public static void main(String[] args) throws InterruptedException {
       introduction();
       numbersIteration.start();
       numbersIteration.join();
       // checking
       System.out.println(numberA);
   }
}
