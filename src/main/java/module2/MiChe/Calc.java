package module2.MiChe;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        float result = 0;
        float second;
        char operarion = 'c';
        while (operarion != 's') {
            if (operarion == 'c') {
                System.out.println("enter first number");
                result = setFirstNumber();
            }

            System.out.println("enter action");
            operarion = setOperation();
            if (operarion == 'c') {
                result = 0;
                continue;
            }
            if(operarion == 's'){
                System.exit(0);
            }

            System.out.println("enter second number");
            second = setSecondNumber();
            if(operarion == '/' && second == 0){
                System.out.println("Division by zero is not possible");
            }else {
                result = action(result, operarion, second);
                System.out.println(result);
            }
        }
    }

    public static float setFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        int firstnumber = scanner.nextInt();
        return firstnumber;
    }

    public static char setOperation() {
        Scanner scanner = new Scanner(System.in);
        char operarion = scanner.next().charAt(0);
        return operarion;
    }

    public static float setSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        int seconfnumber = scanner.nextInt();
        return seconfnumber;
    }

    public static float action(float result, char operation, float operand2) {
        switch (operation) {
            case '+':
                result = result + operand2;
                break;
            case '-':
                result = result - operand2;
                break;
            case '*':
                result = result * operand2;
                break;
            case '/':
                result = result / operand2;
                break;
            default:
                System.out.println("Ne znayu takogo deistviya");
        }
        return result;
        }


}

