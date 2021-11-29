package module2.daniilzhakaev;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+' : ans = num1 + num2;
            case '-' : ans = num1 - num2;
            case '*' : ans = num1 * num2;
            case '/' : ans = num1 / num2;
            default : {
                System.out.print("Error! Enter correct operator");
                return;
            }
        }
    }
}