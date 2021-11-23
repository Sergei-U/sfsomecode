package module14.Malik;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CallCenter callCenter = new CallCenter(3);

        callCenter.newCall("Richard");
        Thread.sleep(500);
        callCenter.newCall("John");
        Thread.sleep(500);
        callCenter.newCall("James");
        Thread.sleep(500);
        callCenter.newCall("Robert");
        Thread.sleep(500);
        callCenter.newCall("Calvin");
    }
}
