package module2.fedot;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        System.out.println("Введите первое значение (нажмите клавишу Enter) ");
        System.out.println("Введите знак операции (+, или -, или  *, или /) (нажмите клавишу Enter) ");
        System.out.println("Введите второе значение (нажмите клавишу Enter) ");
        System.out.println("Что бы обнулить результат вместо знака операции (нажмите клавишу c) ");
        System.out.println("Что бы закрыть программу вместо знака операции (нажмите клавишу s) ");
        Scanner Scan = new Scanner(System.in);

        int result = 0;

        int operand1 = Scan.nextInt();

        char operation1 = Scan.next().charAt(0);
        switch (operation1){
            case 'c':
                result = 0;
                System.out.println(result);
                result = Scan.nextInt();
                operation1 = Scan.next().charAt(0);
                switch (operation1){
                    case 's':
                return;}
                break;
            case 's':
                return;
        }

        int operand2 = Scan.nextInt();

        switch (operation1){
            case '+':
                result = operand1 + operand2;
                System.out.println(result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("Вы ввели не верный знак операции");
        }

        while (true){
            char operation2 = Scan.next().charAt(0);
            switch (operation2){
                case 's':
                return;
                case 'c':
                    result = 0;
                    System.out.println(result);
                    result = Scan.nextInt();
                    operation2 = Scan.next().charAt(0);
                    break;}

            int operand3 = Scan.nextInt();

            switch (operation2){
                case '+':
                    result = result + operand3;
                    System.out.println(result);
                    break;
                case '-':
                    result = result - operand3;
                    System.out.println(result);
                    break;
                case '*':
                    result = result * operand3;
                    System.out.println(result);
                    break;
                case '/':
                    result = result / operand3;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Вы ввели не верный знак операции");
            }
        }

    }
}