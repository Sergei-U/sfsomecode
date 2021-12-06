package module2.panteley;

import java.util.Scanner;

public class Calcsio {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first value: ");
        double operand1 = scanner.nextDouble();
        while (true) {
            System.out.println("Select operation (or press 's' for exit)");
            System.out.print("( + - * / ): ");
            char operation = scanner.next().charAt(0);
            if (operation == 's') {
                System.out.println("Closing...");
                break;
            }
            if (operation == 'c') {
                System.out.println("Clearing...");
                System.out.print("Enter first value: ");
                operand1 = scanner.nextDouble();
                System.out.println("Select operation: ");
                operation = scanner.next().charAt(0);
            }
            System.out.println(" ");
            System.out.print("Enter second value: ");
            double operand2 = scanner.nextDouble();
            double result = calc(operand1, operation, operand2);
            System.out.println(" ");
            System.out.println("Answer is: " + result + ".");
            System.out.println(" ");
            operand1 = result;
        }
    }

    public static double calc(double operand1, char operation, double operand2) {
        double result;
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
            case 'c':
                result = scanner.nextDouble();
                break;
            default:
                System.out.println("Error");
                result = 0;
        }
        return result;
    }
}