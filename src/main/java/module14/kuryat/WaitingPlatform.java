package module14.kuryat;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class WaitingPlatform {

     BlockingQueue<Truck> platformQueue;
    private final int maxTruckCount;

    public WaitingPlatform(int maxTruckCount) {
        this.maxTruckCount = maxTruckCount;
        platformQueue = new LinkedBlockingQueue<>(maxTruckCount);

    }

    public void add(Truck objectTruck) {
        if (platformQueue.size() < maxTruckCount){
            platformQueue.add(objectTruck);
            System.out.println(objectTruck);
        } else if (platformQueue.size() >= maxTruckCount){
            try {
                platformQueue.offer(objectTruck, 500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
