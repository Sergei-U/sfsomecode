package module2.uitaibaby88;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Begin");

        Main.input(); //start of counting

    }

    public static int input() {

        Scanner scanner = new Scanner(System.in); //activate Scanner

        int operand1 = scanner.nextInt(); //input first value

        char function = scanner.next().charAt(0); //input operation symbol

        int operand2 = scanner.nextInt(); //input second value

        switch (function) { //start of checking operation symbol

            case '+': //check for addition

                operand1 += operand2;

                System.out.println("answer = " + operand1);

                break;

            case '-': //check for subtraction

                operand1 -= operand2;

                System.out.println("answer = " + operand1);

                break;

            case '/': //check for division

                if (operand2 != 0) {

                    operand1 /= operand2;

                    System.out.println("answer = " + operand1);

                } else {

                    System.out.println("uncertain result");

                }

                break;

            case '*': //check for multiplication

                operand1 *= operand2;

                System.out.println("answer = " + operand1);

                break;

            default:

                System.out.println("invalid function"); //error operation symbol

        }

        return input(); //restart method

    }

}

/* по поводу задания со звездочкой: ни одно решение не реализовалось. были попытки сделать рекурсию для присвоения

результата к первому операнду и проверка введения символов "С" и "S" (но совместное использование char и int успехом

не увенчалось)

*/