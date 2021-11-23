package module14.AntonDUNA;

public class SumArray {
   private int sum;

   public synchronized int sumArray(int nums[]) { // метод синхроизирован
       sum = 0; // обнуляем сумму

       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);
           try {
               Thread.sleep(10); // разрешить переключение задач
           } catch (InterruptedException exc) {
               System.out.println("Прерывание основного потока");
           }
       }
       return sum;
   }
}

class MyThread implements Runnable {
   Thread thrd;
   static SumArray sa = new SumArray();
   int a[];
   int answer;

   // создать новый поток
   MyThread(String name, int nums[]) {
       thrd = new Thread(this, name);
       a = nums;
       thrd.start(); // запустить поток
   }

   // начать выпонение потока
   @Override
   public void run() {
       int summ;

       System.out.println(thrd.getName() + " - запуск");

       answer = sa.sumArray(a);
       System.out.println("СУММА для " + thrd.getName() + ": " + answer);

       System.out.println(thrd.getName() + " - завершение");
   }
}

class Sync {
   public static void main(String[] args) {
       int a[] = {1, 2, 3, 4, 5, 6};

       MyThread mt1 = new MyThread("Child1", a);
       MyThread mt2 = new MyThread("Child2", a);

   }
}

