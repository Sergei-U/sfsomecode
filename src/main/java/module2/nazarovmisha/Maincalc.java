package module2.nazarovmisha;

import java.util.Scanner;

public class Maincalc {

    public static void main(String[] args) {

        int operand1 = getInt();
        int operand2 = getInt2();
        char operation = getOperation();
        int result = operatsiya(operand1, operand2, operation);
        System.out.println("Rezultat operacii: " + result);
    }

    public static int getInt() {

        System.out.println("Vvedite chislo:");
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        System.out.println("Vvedenoe pervoe chislo: " + operand1);
        return operand1;

    }

    public static int getInt2() {

        System.out.println("Vvedite chislo");
        Scanner sc1 = new Scanner(System.in);
        int operand2 = sc1.nextInt();
        System.out.println("Vvedenoe pervoe chislo: " + operand2);
        return operand2;

    }

    public static char getOperation() {
        System.out.println("Vvedite Deistvie");
        Scanner sc2 = new Scanner(System.in);
        char operation = sc2.next().charAt(0);
        System.out.println("Vi vveli deistvie:" + operation);
        return operation;
    }

    public static int operatsiya(int operand1, int operand2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Operaciya ne raspoznana.");
                result = operatsiya(operand1, operand2, getOperation());
        }
        return result;
    }

}