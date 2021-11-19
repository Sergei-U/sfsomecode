package maksimov;

public class InfiniteCalc {

    double x = 0;

    public double Calc(double operand1, double operand2, char operation) {
        switch (operation) {
                case '-':
                   return x = operand1 - operand2;
                case '+':
                    return x = operand1 + operand2;
                case '*':
                    return x = operand1 * operand2;
                case '/':
                    return x = operand1 / operand2;
                case 's':
                    break;
                case 'C':
                    x = 0;
                    break;
            }
            return x;
        }
    }