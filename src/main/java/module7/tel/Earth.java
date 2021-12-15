package module7.tel;

public class Earth extends Planet implements WaterAble {

    private long size;
    private final boolean WATER;

    Earth() {
        this.size = 12742;
        this.WATER = true;
        System.out.println("Earth was added!");
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public boolean getWater() {
        return WATER;
    }

    @Override
    public String toString() {
        return "This is earth, Man!";
    }
}
