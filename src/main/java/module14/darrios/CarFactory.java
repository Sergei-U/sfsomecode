package module14.darrios;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CarFactory extends Thread {

   private final AtomicInteger carsLeft;
   private final int totalOrders;
   private final AtomicInteger carNumber = new AtomicInteger(0);
   private final ArrayBlockingQueue<String> carcasses = new ArrayBlockingQueue<>(10);
   private final ArrayBlockingQueue<String> engines = new ArrayBlockingQueue<>(10);
   private final ArrayBlockingQueue<String> wheels = new ArrayBlockingQueue<>(10);
   private final ArrayList<Car> readyCars = new ArrayList<>();

   public CarFactory(int amount, int totalCollectionDepartments) {
       totalOrders = amount;
       carsLeft = new AtomicInteger(amount);

       new WheelsDepartment().start();
       new CarcassDepartment().start();
       new EngineDepartment().start();

       if (totalCollectionDepartments < 1) totalCollectionDepartments = 1;
       for (int i=0; i<totalCollectionDepartments; i++) {
           CollectionDepartment collectionDepartment = new CollectionDepartment();
           collectionDepartment.setName("Department " + (i + 1));
           collectionDepartment.start();
       }
   }

   static class Car {
       private String carcass;
       private String engine;
       private String wheels;
       public Car(String carcass, String engine, String wheels) {
           this.carcass = carcass;
           this.engine = engine;
           this.wheels = wheels;
       }
   }

   private class WheelsDepartment extends Thread {
       public void run() {
           for (int i=0; i<totalOrders; i++) {
               try {
                   Thread.sleep(1000);
                   wheels.put("Wheels for car " + (i + 1) + " is ready");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }

   private class CarcassDepartment extends Thread {
       public void run() {
           for (int i=0; i<totalOrders; i++) {
               try {
                   Thread.sleep(3000);
                   carcasses.put("Carcass for car " + (i + 1) + " is ready");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }

   private class EngineDepartment extends Thread {
       public void run() {
           for (int i=0; i<totalOrders; i++) {
               try {
                   Thread.sleep(5000);
                   engines.put("Engine for car " + (i + 1) + " is ready");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }

   private class CollectionDepartment extends Thread {
       public void run() {
           while (carsLeft.get() > 0) {
               if (isInterrupted()) break;
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               synchronized (engines) {
                   try {
                       String engine = engines.poll(6000, TimeUnit.MILLISECONDS);
                       if (engine == null) break;

                       String carcass = carcasses.poll(4000, TimeUnit.MILLISECONDS);
                       String wh = wheels.poll(2000, TimeUnit.MILLISECONDS);

                       System.out.println(this.getName() + ": Car #" + carNumber.incrementAndGet() + " is ready!");
                       readyCars.add(new Car(carcass, engine, wh));
                       carsLeft.decrementAndGet();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       }
   }

   public static void main(String[] args) {
       new CarFactory(10, 2).start();
   }
}

