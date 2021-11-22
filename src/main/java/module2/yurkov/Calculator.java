package module2.yurkov;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        int operand1;
        int operand2;
        int operand3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый операнд");
        operand1 = scanner.nextInt();//считывает число


        System.out.println("Введите символ вычисления");
        char operation = scanner.next().charAt(0);


        System.out.println("Введите второй операнд");
        operand2 = scanner.nextInt();//считывает число


        switch (operation){
            case '+':
                operand3 = operand1 + operand2;
                break;
            case '-':
                operand3 = operand1 - operand2;
                break;
            case '/':
                operand3 = operand1 / operand2;
                break;
            case '*':
                operand3 = operand1 * operand2;
                break;
            default:
                System.out.println("нет знака вычисления");
               
        }

        System.out.println("результат вычисления: " + operand3);

        scanner.close();

    }
}

