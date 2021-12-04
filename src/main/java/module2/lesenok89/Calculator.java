package module2.lesenok89;

import java.util.Scanner;

public class Calculator {
    static double operand1;
    static double operand2;
    static char operand;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        operand1 = scanner.nextDouble();
        System.out.println("Введите оператор: ");
        operand = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        operand2 = scanner.nextDouble();
        System.out.println("Ответ: " + calc(operand1, operand, operand2));
    }

    private static double calc(double operand1, char operand, double operand2) {
        double result = 0;
        switch (operand){            
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Ошибка ввода. Повторите");
                        }
        return result;
    }
}