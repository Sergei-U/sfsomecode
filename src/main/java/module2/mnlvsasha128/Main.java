package module2.mnlvsasha128;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            int num1;
            int num2;
            int answer;
            char oper;

            Scanner input = new Scanner(System.in);
            System.out.print("Input first number: ");
            num1 = input.nextInt();
            System.out.print("Choose an operator (+, -, *, /): ");
            oper = input.next().charAt(0);
            System.out.print("Input second number: ");
            num2 = input.nextInt();

            switch (oper) {
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    answer = num1 / num2;
                    break;
                default:
                    System.out.print("Error! Try again");
                    return;
            }

            System.out.println(num1 + " " + oper + " " + num2 + " = " + answer);
        }
    }
}