package module2.rayman;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private double operand1 = 0.0;
    private double operand2 = 0.0;
    private String mathOper = "";
    private String dataLine = "";
    public boolean isClear = true; //flag dlya ocistki tekushego znacheniya

    // Metod dlya vvoda pervogo operanda
    public void enterFirstOperand() {
        isClear = false;

        System.out.println("Vvedite pervoe chislo:");

        while (true) {
            if (scanner.hasNextDouble()) {
                operand1 = scanner.nextDouble();
                break;
            }
            else if(scanner.hasNextLine()) {
                dataLine = scanner.nextLine();
                if (dataLine.equals("c") || ("C").equals(dataLine) || dataLine.equals("C")) {
                    operand1 = 0.0;
                    System.out.println(operand1);
                }
                else if (dataLine.equals("s")  || dataLine.equals("S")){
                    System.exit(0);
                }
                else{
                    scanner.next();
                    System.out.println("Oshibka: vi vveli ne chislo!");
                    System.out.println("Vvedite pervoe chislo:");
                }
            }
        }
        scanner.nextLine();
    }

    //metod dlya vvoda operacii
    public void enterMathOper() {

        System.out.println("Vvedite operaciyu:");

        while (true) {
            mathOper = scanner.nextLine();
            if (mathOper.equals("+") || mathOper.equals("-") || mathOper.equals("*") || mathOper.equals("/"))
                break;
            else if(mathOper.equals("c")  || mathOper.equals("C")){
                operand1 = 0.0;
                System.out.println(operand1);
                isClear = true;
                break;
            }
            else if (mathOper.equals("s")  || mathOper.equals("S")){
                System.exit(0);
            }
            else {
                System.out.println("Oshibka: vi vveli nepravilnuy operaciyu!");
                System.out.println("Vvedite operaciyu:");
            }
        }

    }

    // metod dlya vvoda vtorogo operanda
    public void enterSecondOperand() {

        while (true) {
            if(isClear)
                break;

            System.out.println("Vvedite vtoroe chislo:");

            if (scanner.hasNextDouble()) {
                operand2 = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            else if(scanner.hasNextLine()) {
                dataLine = scanner.nextLine();
                if (dataLine.equals("c")  || dataLine.equals("C")) {
                    operand1 = 0.0;
                    System.out.println(operand1);
                    isClear = true;
                    break;
                }
                else if (dataLine.equals("s")  || dataLine.equals("S")){
                    System.exit(0);
                }
                else {
                    System.out.println("Oshibka: vi vveli ne chislo!");
                }
            }
        }
    }

    //metod dlya vivoda rezultata
    public void getResult() {
        if(!isClear){
            switch (mathOper) {
                case "+":
                    operand1 = operand1 + operand2;
                    break;
                case "-":
                    operand1 = operand1 - operand2;
                    break;
                case "*":
                    operand1 = operand1 * operand2;
                    break;
                case "/":
                    operand1 = operand1 / operand2;
                    break;
                default:
                    System.out.println("Ti chtoto naputal");
            }
            System.out.println("Rezultat:\n" + operand1);
        }
    }
}
