package main.java.eka;

public class FirstClass {
    public int a, b, c;

    FirstClass(int a) {
        this.a = 5;
        this.b = 3;
    }

    public int plus(int d) {
        this.a += d;
        return a;
    }

    public static class SecondClass extends FirstClass {
        SecondClass(int a, int b, int c) {
            super(a);
            this.b = b;
            this.c = c;
        }

        @Override
        public int plus(int d) {
            return super.plus(d) + a;
        }
    }

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass(6, 4, 3);
        System.out.println(secondClass.plus(10));
    }
}
