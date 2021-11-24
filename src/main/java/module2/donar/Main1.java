package module2.donar;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operand1");
        int operand1 = sc.nextInt();
        System.out.println("enter operation");
        char operation = sc.next().charAt(0);
        System.out.println("enter operand2");
        int operand2 = sc.nextInt();
        int result = 0;
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else {
            System.out.println("Некорректный оператор! Повторите ввод!");
        }
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }
}
