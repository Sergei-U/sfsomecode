package vik;

public class Main {

    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();


    }

    public static int first() {
        int x = 12;
        return x;
    }

    public static void second() {
        int y = first() + 2;
    }
}
