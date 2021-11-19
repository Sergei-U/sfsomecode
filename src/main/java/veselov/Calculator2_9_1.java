package veselov;

import java.util.Scanner;

public class Calculator2_9_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = 0;
        char operation = 'C';
        double operand2 = 0;

        do {
            if (operation == 'C') {
                System.out.println("Введите первый операнд:");
                operand1 = scanner.nextDouble();
            }
            System.out.println("Введите символ операции ('+', '-', '*', '/', 'C', 's'):");
            operation = scanner.next().charAt(0);

            if (operation != 's' && operation != 'C') {
                System.out.println("Введите второй операнд:");
                operand2 = scanner.nextDouble();
            }

            switch (operation) {
                case '+':
                    output(operand1,operand2,operation);
                    System.out.println(operand1 += operand2);
                    break;
                case '-':
                    output(operand1,operand2,operation);
                    System.out.println(operand1 -= operand2);
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("На ноль делить нельзя.");
                        operation = 'C';
                    }
                    else
                        output(operand1,operand2,operation);
                    System.out.println(operand1 /= operand2);
                    break;
                case '*':
                    output(operand1,operand2,operation);
                    System.out.println(operand1 *= operand2);
                    break;
                case 's':
                    System.out.println("Работа закончена");
                    break;
                case 'C':
                    System.out.println("Текущее значение стерто");
                    break;
                default:
                    System.out.println("Неверно введены данные.");
                    operation ='C';
            }
        } while (operation != 's');
    }

    // функция вывода на экран Результата операции
    public static void output (double operand1,double operand2, char operation){
        System.out.print("Результат: " + operand1 + " " + operation + " " + operand2 + " = ");
    }
}