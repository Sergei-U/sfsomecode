package module7.tel;

public class Mars extends Planet {

    private long size;
    private final boolean WATER;

    Mars() {
        this.size = 6780;
        this.WATER = true;
        System.out.println("Mars was added!");
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "This is mars, Man!";
    }

}
