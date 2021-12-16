package module2.wermach95;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print expression line by line:");
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();

        switch (operation) {
            case '+':   
                System.out.println(operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '/':
                System.out.println(operand1 / operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            default:
                System.out.println("The following operation is not supported: " + operation);
        }
    }
}
