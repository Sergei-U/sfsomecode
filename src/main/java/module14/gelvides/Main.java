package module14.gelvides;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Casino cas = new Casino();
        cas.start();
        new Thread(new User("Player1")).start();
        new Thread(new User("Player2")).start();
        new Thread(new User("Player3")).start();
        new Thread(new User("Player4")).start();
        Thread.currentThread().sleep(300);
        new Thread(new User("Player5")).start();
        new Thread(new User("Player6")).start();
        Thread.currentThread().sleep(500);
        new Thread(new User("Player7")).start();
        new Thread(new User("Player8")).start();
    }
}
