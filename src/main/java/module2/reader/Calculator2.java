package module2.reader;

import java.util.Scanner;

/**
 *  Задание 2.9.2*
 *  Не обрабатывает исключения, в случае ввода символов вместо цифр.
 */
public class Calculator2 {
    public static void main(String[] args) {
        System.out.println("Привет! Я калькулятор 2.0, той версии, что посложнее!");
        System.out.println("Пожалуйста, введите Ваше математическое выражение!");
        System.out.println(" ");
        boolean swicher = true; // Кнопка выключения, если true, то включен.
        while (swicher) {
            Scanner scanner = new Scanner(System.in);
            double operand1 = scanner.nextDouble();
            char operation = scanner.next().charAt(0);
            double operand2 = scanner.nextDouble();

            double result = calc(operand1, operand2, operation);

            while (true) { // Запускаем бесконечный
                operation = scanner.next().charAt(0);
                if (operation == 'C') {
                    System.out.println("0\n Можете вводить новое выражение!");
                    break; // Вылетает в верхний цикл, чтобы начать всё сначала.
                } else if (operation == 'r') {
                    System.out.println("Я выключаюсь, пока!");
                    swicher = false; // Выключает калькулятор.
                    break;
                }
                operand2 = scanner.nextDouble();
                result = calc(result, operand2, operation);
            }
        }
    }

    /**
     * Основной метод калькулятора
     * @param operand1 Операнд 1
     * @param operand2 Операнд 2
     * @param operation Арифметическая операция
     * @return Результат математической операции или операнд 1 при неудаче, например в случае попытки деления на 0.
     */
    public static double calc(double operand1, double operand2, char operation) {
        boolean check = true; // Проверяет, можно ли печатать итоговый результат. Случай, когда все действия допустимы.

        switch (operation) {
            case '+':
                operand1 += operand2;
                break;
            case '-':
                operand1 -= operand2;
                break;
            case '*':
                operand1 *= operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    operand1 /= operand2;
                } else System.out.println("На ноль делить нельзя!\n Вывожу первый операнд!");
                break;
            default:
                System.out.println("Введена неверная операция!");
                check = false;
        }
        if (check) {
            System.out.println(operand1);
        }
        return operand1;
    }
}