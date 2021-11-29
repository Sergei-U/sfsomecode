package module2.rayman;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            if(calculator.isClear) {
                calculator.enterFirstOperand();
            }

            calculator.enterMathOper();
            calculator.enterSecondOperand();
            calculator.getResult();
        }
    }
}
