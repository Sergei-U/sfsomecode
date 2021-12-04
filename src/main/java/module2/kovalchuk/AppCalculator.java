package module2.kovalchuk;

import java.util.Scanner;

public class AppCalculator {

    private static final String VALUE_FOR_EXIT = "s";
    private static final String VALUE_FOR_NULL = "c";
    private static double result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String doubleString1 = scan.next();
        if (VALUE_FOR_EXIT.equals(doubleString1)) {
            return;
        }
        if (VALUE_FOR_NULL.equals(doubleString1)) {
            result = 0.0;
            main(null);
        }
        double operand1 = Double.valueOf(doubleString1);
        result = operand1;
        while (true) {
            char operation = scan.next().charAt(0);
            String charString = String.valueOf(operation);
            if (VALUE_FOR_EXIT.equals(charString)) {
                return;
            }
            if (VALUE_FOR_NULL.equals(charString)) {
                result = 0.0;
                main(null);
            }
            String doubleString2 = scan.next();
            if (VALUE_FOR_EXIT.equals(doubleString2)) {
                return;
            }
            if (VALUE_FOR_NULL.equals(doubleString2)) {
                result = 0.0;
                main(null);
            }
            double operand2 = Double.valueOf(doubleString2);
            switch (operation) {
                case '+':
                    System.out.println(result + operand2);
                    result = result + operand2;
                    break;
                case '-':
                    System.out.println(result - operand2);
                    result = result - operand2;
                    break;
                case '*':
                    System.out.println(result * operand2);
                    result = result * operand2;
                    break;
                case '/':
                    System.out.println(result / operand2);
                    result = result / operand2;
                    break;
            }
        }
    }
}