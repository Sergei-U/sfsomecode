package module2.Antoni;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getOperand();
        char operation = getOperation();
        int operand2 = getOperand();
        int result = calculation(operand1, operand2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getOperand() {
        System.out.println("Число:");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Введите число! ");
            scanner.next();//рекурсия
            operand = getOperand();
        }
        return operand;
    }

    public static char getOperation() {
        System.out.println("Операция:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Введите операцию правильно! ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calculation(int operand1, int operand2, char operation) {
        int result;
        switch (operation) {
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
                System.out.println("Введите операцию правильно! ");
                result = calculation(operand1, operand2, getOperation());
        }
        return result;
    }
}