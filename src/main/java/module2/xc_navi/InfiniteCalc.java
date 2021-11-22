package module2.xc_navi;

import java.util.Scanner;

public class InfiniteCalc {

    double x = 0;

    public double Calc(double operand1, double operand2, char operation) {
        if (operation == 's') {
            return 0;
        } else {

            switch (operation) {

                case '-':
                    x = operand1 - operand2;
                    break;
                case '+':
                    x = operand1 + operand2;
                    break;
                case '*':
                    x = operand1 * operand2;
                    break;
                case '/':
                    x = operand1 / operand2;
                    break;
                case 's':
                    break;
                case 'C':
                    x = 0;
                    break;
                default:
                    break;
            }


            return x;
        }


    }
}






