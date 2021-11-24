package module2.donar;

import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        char operation = sc.next().charAt(0);
        int operand2 = sc.nextInt();
        int result = 0;

        switch (operation) {
            case '+':
                Calculator.addition(operand1, operand2, operation);
                break;
            case '-':
                Calculator.subtraction(operand1, operand2, operation);
                break;
            case '*':
                Calculator.multiplication(operand1, operand2, operation);
                break;
            case '/':
                Calculator.division(operand1, operand2, operation);
                break;
            default:
                System.out.println("Некорректный оператор!");
                break;
        }

    }

}

class Calculator {
    public static void addition(int operand1, int operand2, char operation) {
        double result = operand1 + operand2;
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }

    public static void subtraction(int operand1, int operand2, char operation) {
        double result = operand1 - operand2;
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }
    public static void multiplication(int operand1, int operand2, char operation) {
         double result = operand1 * operand2;
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }
    public static void division(int operand1, int operand2, char operation) {
        double result = operand1 / operand2;
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }
}
