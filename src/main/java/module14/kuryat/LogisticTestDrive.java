package module14.kuryat;

public class LogisticTestDrive {

    public static void main(String[] args) {
        WaitingPlatform platform = new WaitingPlatform(10);
        TruckGenerator generator = new TruckGenerator(platform, 15);
        Warehouse<Food> wFood = new Warehouse<>(new Food(), platform);
        Warehouse<Material> wMaterial = new Warehouse<>(new Material(), platform);
        Warehouse<Other> wOther = new Warehouse<>(new Other(), platform);

        Thread threadGenerator = new Thread(generator);
        Thread threadWFOOD = new Thread(wFood);
        Thread threadWMaterial = new Thread(wMaterial);
        Thread threadWOther = new Thread(wOther);
        threadGenerator.start();
        threadWFOOD.start();
        threadWMaterial.start();
        threadWOther.start();

    }
}
