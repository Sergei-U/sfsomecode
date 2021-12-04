package module2.kostya0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int resault = Calculator.calc();
        System.out.println("Результат:  " + resault);
        int d = 1;
        while (d == 1) {
            System.out.println("Введите операцию");
            char operation = scanner.next().charAt(0);
            if (operation == 's') {
                System.out.println("Завершено");
                break;

            } else if(operation == 'C') {
                System.out.println("Результат: 0");
                resault = Calculator.calc();
                System.out.println("Результат:  " + resault);

            } else {
                System.out.println("Введите второе число");
                int operand3 = scanner.nextInt();
                resault = Action.action(resault, operand3, operation);
                System.out.println(resault);
            }


        }




    }
}