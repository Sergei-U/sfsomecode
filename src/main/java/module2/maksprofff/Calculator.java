package module2.maksprofff;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite celoe chislo � ");

        int operand1 = scanner.nextInt();

        System.out.println("Vvedite odin iz operatorov( + - * / ): ");

        char operation = scanner.next().charAt(0);

        System.out.println("Vvedite celoe chislo � ");

        int operand2 = scanner.nextInt();

        System.out.println("Resul'tat: " + calc(operand1, operand2, operation));

    }

    public static int calc(int operand1, int operand2, char operation) {

        int res = 0;

        switch (operation) {

            case '+':

                res = operand1 + operand2;

                break;

            case '-':

                res = operand1 - operand2;

                break;

            case '*':

                res = operand1 * operand2;

                break;

            case '/':

                res = operand1 / operand2;

                break;

            default:

                System.out.println("Neverniy operator");

        }

        return res;

    }

}