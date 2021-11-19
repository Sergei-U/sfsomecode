package maksimov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//метод считывает строку с клавиатуры

        InfiniteCalc calc = new InfiniteCalc();
        String enterOperation = "Enter operation + - * / or s to Exit, or C to clear";
        String answer = "And the answer is: ";
        System.out.println("Enter Number1");
        double operand1 = scanner.nextDouble(); //считывает число
        System.out.println(enterOperation);
        char operation = scanner.next().charAt(0);
        System.out.println("Enter Number2");
        double operand2 = scanner.nextDouble(); //считывает число
        double x = 0;
        x = calc.Calc(operand1, operand2, operation);
        System.out.println(answer + x);
        while (operand1 != 0 && operand2 != 0 && operation != 's') {
            double sum = x;
            System.out.println(enterOperation);
            operation = scanner.next().charAt(0);
            System.out.println("Enter Number2");
            operand2 = scanner.nextDouble(); //считывает число
            double y = calc.Calc(sum, operand2, operation);
            System.out.println(answer + y);
        }
    }
}