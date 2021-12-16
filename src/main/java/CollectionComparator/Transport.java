package CollectionComparator;

public class Transport {
    private final String type;
    private final String fuel;
    private double speed;

    public Transport(String type, String fuel, double speed) {
        if (type == null || fuel == null || speed <= 0) {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.fuel = fuel;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", speed=" + speed +
                '}';
    }
}


