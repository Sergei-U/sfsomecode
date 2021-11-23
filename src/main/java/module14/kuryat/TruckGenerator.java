package module14.kuryat;



public class TruckGenerator implements Runnable{
    WaitingPlatform platform;
    private final int trucksToGenerate;

    public TruckGenerator(WaitingPlatform platform, int trucksToGenerate){
        this.platform = platform;
        this.trucksToGenerate = trucksToGenerate;
    }

    public void generateTruck(){
        platform.add(new Truck());
    }


    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < trucksToGenerate; i++) {
                generateTruck();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("done");
            break;
        }

    }
}
