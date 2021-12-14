package module4.xc_navi;

public class Helicopter {
    private int x;
    private int h;
    private String name;
    private boolean broken;


    public void setPosition(int h, int x) {
        this.h = h;
        this.x = x;

    }

    private int getX() {
        return x;
    }

    private int getH() {
        return h;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goForward(int x) {
        this.x += x;
    }

    public void goBack(int x) {
        goForward(-x);
    }

    public void goUp(int h) {
        this.h += h;
    }

    public void goDown(int h) {
        goUp(-h);
        while (this.h <= 0) {

            System.out.println("Helicopter " + getName() + " crashed");
            broken = true;
            break;
        }
    }

    void printPosition() {
        if (broken == false) {
            System.out.println("Helicopter " + getName() + " at the altitude position: " + getH() + " and range: " + getX());
        } else {
            System.out.println("Helicopter " + getName() + " is broken.");
        }
    }
}
