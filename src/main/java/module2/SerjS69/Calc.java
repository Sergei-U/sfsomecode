package module2.SerjS69;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        char operand;
        char calculateoroperator = 'c';
        double result = 0;

        do {
            if (calculateoroperator == 'c') {
                System.out.println("введите первый операнд");
                val1 = scanner.nextDouble();
                System.out.println("введите оператор:");
                operand = scanner.next().charAt(0);
            } else {
                val1 = result;
                operand = calculateoroperator;
            }

            System.out.println("введите второй операнд");
            val2 = scanner.nextDouble();

            result = calculate(val1, val2, operand);
            System.out.println(val1 + " " + operand + " " + val2 + " = " + result);
            calculateoroperator = scanner.next().charAt(0);

        } while (calculateoroperator != 'S');
    }

    public static double calculate(double val1, double val2, char operand) {
        return switch (operand) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println("не верный ввод");
                yield 0;
            }
        };

    }
}