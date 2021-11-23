package module14.SMansur;

public class Test extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Test thread = new Test();
    thread.start();
    
    while(thread.isAlive()) {
      System.out.println("Ожидание….");
    }

    System.out.println("Test1" + amount);
    amount++;

    System.out.println("Test2 " + amount);
  }
  public void run() {
    amount++;

  }
}

