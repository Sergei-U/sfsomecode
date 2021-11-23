package module14.kuryat;

public class Warehouse <T> implements Runnable{
    T type;
    WaitingPlatform platform;
    Truck truck;
    public Warehouse(T t, WaitingPlatform platform){
        this.type = t;
        this.platform = platform;
    }

    public Truck getTruck(){
        truck = platform.platformQueue.peek();
        if (truck.getType().equals(type.getClass().getSimpleName())){
            platform.platformQueue.remove(truck);
            return truck;
        } else return null;
    }
    public void unload(){
        if (truck != null) {
            for (int i = 0; i < truck.getSize(); i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Машина с " + truck.getType() + " разгружена");
            truck = null;

        }
    }

    @Override
    public void run() {
        while (true){
            try {
            truck = getTruck();
            unload();

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                try {
                    Thread.sleep(100);
                    continue;
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}
