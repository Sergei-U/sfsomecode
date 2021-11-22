package module2.frontline;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int operand1 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");

        char operation = scanner.next().charAt(0);

        System.out.print("Введите число: ");

        int operand2 = scanner.nextInt();

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

                System.out.print("Неверный оператор");

                return;

        }

        System.out.print("Результат: ");

        System.out.print(operand1 + " " + operation + " " + operand2 + " = " + result);

    }

}