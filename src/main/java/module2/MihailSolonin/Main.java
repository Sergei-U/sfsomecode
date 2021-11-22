package module2.MihailSolonin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int operand1 = scanner.nextInt();
        System.out.println("Введите +, -, * или /");
        char operation = scanner.next().charAt(0);
        if (operation != 053 & operation != 052 & operation != 055 & operation != 057) {
            System.out.println("Неверный оператор");
        } else {
            System.out.println("Введите число");
            int operand2 = scanner.nextInt();
            int result = calculator(operand1, operation, operand2);
            System.out.println(result);
        }
    }

    private static int calculator(int operand1, char operation, int operand2) {
        int result;
        switch (operation) {
            case 053:
                result = operand1 + operand2;
                break;
            case 055:
                result = operand1 - operand2;
                break;
            case 052:
                result = operand1 * operand2;
                break;
            case 057:
                result = operand1 / operand2;
                break;
            default:
                result = 0;
        }
        return result;
    }
}