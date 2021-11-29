package module2.m2;

public class Loader {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c;

        c = a + b;
        System.out.println(c);
        c += a;
        System.out.println(c);
        c -= a ;
        System.out.println(c);
        c *= a ;
        System.out.println(c);
        c /= a ;
        System.out.println(c);
        c %= 13 ;
        System.out.println(c);
    }
}