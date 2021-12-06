package module2.mashenka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = number();
        int num2 = number();
        char oper = operation();
        int result = calc(num1, num2, oper);
        System.out.println("Результат операции: " + result);
    }

    public static int number() {
        System.out.println("Введите число:");
        int num;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = number();
        }
        return num;
    }

    public static char operation() {
        System.out.println("Введите операцию:");
        Scanner scanner = new Scanner(System.in);
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = operation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char oper) {
        int result;
        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, operation());//рекурсия
        }
        return result;
    }
}
