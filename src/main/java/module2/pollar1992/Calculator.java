package module2.pollar1992;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        double answer;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 number:");

        double operand1 = input.nextDouble();
        System.out.println("Enter operation:");

        char operation = input.next().charAt(0);
        System.out.println("Enter 2 number:");
        double operand2 = input.nextDouble();

        switch(operation) {
            case '+':answer = operand1 + operand2;
                break;
            case '-':
                answer = operand1 - operand2;
                break;
            case '*':
                answer = operand1 * operand2;
                break;
            case '/':
                answer = operand1 / operand2;
                break;
            default:
                System.out.println("Error! Enter correct operation");
                return;
        }

        System.out.print("Result: " + answer);
    }
}
