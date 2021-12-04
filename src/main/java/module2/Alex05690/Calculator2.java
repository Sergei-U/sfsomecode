package module2.Alex05690;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        double operand_1 = 0, operand_2 = 0, result;
        char symbol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор запущен");
        while (true) {
            while (true) {
                if (sc.hasNextDouble()) {
                    operand_1 = sc.nextDouble();
                } else {
                    symbol = chek(sc.next().charAt(0));
                    if (symbol == 'c') {
                        break;
                    }
                }
                symbol = chek(sc.next().charAt(0));
                if (symbol == 'c') {
                    break;
                }
                if (sc.hasNextDouble()) {
                    operand_2 = sc.nextDouble();
                } else {
                    symbol = chek(sc.next().charAt(0));
                    if (symbol == 'c') {
                        break;
                    }
                }
                result = action(operand_1, symbol, operand_2);
                System.out.println(result);
                while (true){
                    symbol = chek(sc.next().charAt(0));
                    if (symbol == 'c') {
                        break;
                    }
                    if (sc.hasNextDouble()) {
                        operand_2 = sc.nextDouble();
                    } else {
                        symbol = chek(sc.next().charAt(0));
                        if (symbol == 'c') {
                            break;
                        }
                    }
                    result = action(result, symbol, operand_2);
                    System.out.println(result);
                }


            }
        }
    }


    private static double action(double a, char b, double c) {
        double result = 0;
        switch (b) {
            case '+':
                result = a + c;
                break;
            case '-':
                result = a - c;
                break;
            case '/':
                result = a / c;
                break;
            case '*':
                result = a * c;
                break;
            default:
                System.out.println("Неправильно введено действие");
                break;
        }
        return result;
    }

    private static char chek(char symbol) {
        char result = '0';
        switch (symbol) {
            case '+':
            case '-':
            case '*':
            case '/':
                result = symbol;
                break;
            case 's':
                System.out.println("Отключение");
                System.exit(0);
                break;
            case 'c':
                System.out.println("Вычисления сброшены");
                System.out.println("0");
                result = symbol;
                break;
            default:
                System.out.println("Недопустимый символ");
                result = symbol;
                break;
        }
        return result;
    }
}