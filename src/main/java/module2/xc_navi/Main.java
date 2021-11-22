package module2.xc_navi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //метод считывает строку с клавиатуры
        InfiniteCalc calc = new InfiniteCalc();
        String enterOperation = "Enter operation + - * / or s to Exit, or C to clear";
        String answer = "And the answer is:  ";
        char operation = 0;
        double x = 0;
        System.out.println("Enter Number1");
        double operand1 = scanner.nextDouble(); //считывает число
    /*Метод next() класса Scanner считывает строку,
    а метод charAt(0) позволяет взять первый символ в этой строке.
     так мы получаем операцию, которую нужно выполнить*/
        while (true) {

            System.out.println(enterOperation);
            operation = scanner.next().charAt(0);
            if (operation == 's') {
                break;
            } else if (operation == 'C'){x=0;
                System.out.println("Enter Number1");
                operand1 = scanner.nextDouble(); //считывает число
            }
            else{
                System.out.println("Enter Number2");
                double operand2 = scanner.nextDouble(); //считывает число
                if (operation == '/' && operand2 == 0) {
                    System.out.println("Do not divide by zero");
                } else if (x == 0) {
                    x = calc.Calc(operand1, operand2, operation);
                    System.out.println(answer + x);
                } else {
                    x = calc.Calc(x, operand2, operation);
                    System.out.println(answer + x);
                }
            }
        }

    }
}
