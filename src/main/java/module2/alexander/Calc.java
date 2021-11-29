package module2.alexander;

import java.util.Scanner;
 
public class Calc {
 
    private static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция");
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первый операнд");
            double a = scanner.nextDouble();
            while (true) {
                System.out.println("Введите оператор");
                char op = scanner.next().charAt(0);
                if (op == 'C') {
                    break;
                } else if (op == 's') {
                    System.exit(0);
                }
                System.out.println("Введите второй операнд");
                double b = scanner.nextDouble();
                try {
                    a = calculate(a, b, op);
                    System.out.println(a);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }
    }
}
