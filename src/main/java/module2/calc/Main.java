package module2.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        double x = scanner.nextDouble();
        System.out.println("enter y");
        double y = scanner.nextDouble();
        test(BasicOperation.class, x, y);
        test(ExtendedOperation.class, x, y);
    }
    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}

