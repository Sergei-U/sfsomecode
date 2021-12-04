package module2.kostya0;

import java.util.Scanner;

public class Calculator {
    public static int calc() {
        int resault = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int operand1 = scanner.nextInt();

        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число :");
        int operand2 = scanner.nextInt();
        resault = Action.action(operand1, operand2, operation);

        return resault;
        }

}