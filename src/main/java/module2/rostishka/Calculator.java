package module2.rostishka;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        char operation = getOperation();
        int operand2 = getInt();
        int result = calc(operand1, operation, operand2);
        System.out.println("Результат действия: " + result);
    }

    public static int getInt() {
        System.out.println("Введи число: ");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Неверное число. Попробуйте еще.");
            scanner.next();
            operand = getInt();
        }
        return operand;
    }

    public static char getOperation() {
        System.out.println("Введи действие: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Операция неверна. Попробуйте еще.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, char operation, int num2) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Действие неправильно. Повторите.");
                result = calc(num1, getOperation(), num2);
        }

        return result;
    }
}