package module2.hovrin;

import java.util.Arrays;
import java.util.Scanner;

public class Calc{
    public static Scanner sc = new Scanner(System.in);
    public static int operand1;
    public static char operation;
    public static int operand2;
    public static void main(String[] args) {
        operand1 = getInt(1);
        operation = ' ';
        operand2 = 0;
        while (operation != 's') {
            operation = getChar();
            switch (operation) {
                case 'C':
                    System.out.println(0);
                    operand1 = 0;
                    continue;
                case 's':
                    continue;
                case '+':
                    operand2 = getInt(2);
                    printOutStr(operand1 + operand2);
                    operand1 += operand2;
                    break;
                case '-':
                    operand2 = getInt(2);
                    printOutStr(operand1 - operand2);
                    operand1 -= operand2;
                    break;
                case '*':
                    operand2 = getInt(2);
                    printOutStr(operand1 * operand2);
                    operand1 *= operand2;
                    break;
                case '/':
                    operand2 = getInt(2);
                    if (operand2 == 0) {
                        System.out.println("Деление на ноль!");
                    } else {
                        printOutStr(operand1 / operand2);
                        operand1 /= operand2;
                    }
                    break;
                default:
                    System.out.println("Неверный символ!");
            }
        }
    }

    public static void printOutStr(int result){
        String outString = "Результат: " + operand1 + operation + operand2 + "=" + result;
        System.out.println(outString);
        System.out.println(result);
    }

    public static char getChar() {
        System.out.println("Операция:");
        if (!sc.hasNextInt()) {
            return sc.next().charAt(0);
        }
        return ' ';
    }

    public static int getInt(int num) {
        String outString = " операнд:";
        if (num == 1) {
            outString = "Первый" + outString;
        } else if (num == 2) {
            outString = "Второй" + outString;
        }
        System.out.println(outString);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        return 0;
    }
}