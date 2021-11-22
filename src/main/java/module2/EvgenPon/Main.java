package module2.EvgenPon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operand1;
        int operand2;
        double ans;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operand # 1: ");
        operand1 = scanner.nextInt();
        System.out.print("\nEnter an operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        System.out.print("Enter operand # 2: ");
        operand2 = scanner.nextInt();
        switch (operation) {
            case '+':
                ans = operand1 + operand2;
                break;
            case '-':
                ans = operand1 - operand2;
                break;
            case '*':
                ans = operand1 * operand2;
                break;
            case '/':
                ans = (double) operand1 / (double) operand2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(operand1 + " " + operation + " " + operand2 + " = " + ans);

    }
}