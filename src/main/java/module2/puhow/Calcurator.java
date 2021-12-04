package module2.puhow;

import java.util.Scanner;

public class Calcurator {
    public static void main(String[] args) {
        System.out.println(" ПРОСТОЙ КАЛЬКУЛЯТОР (+, -, /, *) \n" +
                "Введите значения в следующей последовательности: 1 операнд, выполняемая операция, 2 операнд:");

        Scanner scanner = new Scanner(System.in);
        float operand1 = scanner.nextFloat();
        char operation = scanner.next().charAt(0);
        float operand2 = scanner.nextFloat();
        float result;

        if (operation == '+') {
            result = operand1 + operand2;
            System.out.println(result);
        } else if (operation == '-') {
            result = operand1 - operand2;
            System.out.println(result);
        } else if (operation == '/') {
            result = operand1 / operand2;
            System.out.println(result);
        } else if (operation == '*') {
            result = operand1 * operand2;
            System.out.println(result);
        } else
            System.out.println("Пожалуйста, проверьте правильность введеной операции:\n" +
                    "+ сложение\n" +
                    "- вычитание\n" +
                    "/ деление\n" +
                    "* умножение");
    }

}
