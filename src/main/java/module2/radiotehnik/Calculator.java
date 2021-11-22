package module2.radiotehnik;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("This program performs a mathematical operation between two operands.");
        float operand1 = 0;
        float operand2 = 0;
        float result = 0;
        char operation = 0;

        boolean isOperand1Entered = false; // Операнд 1 введён корректно
        boolean isOperand2Entered = false; // Операнд 2 введён корректно
        boolean isOperationEntered = false; // Операция введёна корректно
        boolean isFinalAction = true; // Разрешить показать результат вычислений?

        boolean isProgrammExit = false; // Флаг выхода из программы
        boolean isProgrammClear = true; // Флаг очистки ввода операнда 1


        while (!isProgrammExit) //Основной цикл калькулятора
        {

            //-----------------------------------------------------------------
            while (!isOperand1Entered) // Ввод операнда 1
            {
                if (isProgrammClear == false) // Если не было сброса, то в качестве operand 1 предлагаем использовать result
                {
                    operand1 = result;
                    System.out.println("First operand1 " + " = " + operand1);
                    isOperand1Entered = true;
                    break;

                }

                System.out.println("Please enter the first operand 1 (For exit, enter 's', for clear enter 'c)");
                Scanner scanner = new Scanner(System.in); // Создали объект и указали источник данных
                if (scanner.hasNextFloat()) // Если пользовател ввёл вещественное число, то считаем, что операн 1 введён корректно
                {
                    operand1 = scanner.nextFloat();
                    System.out.println("You entered " + operand1);
                    isOperand1Entered = true;
                    isFinalAction = true;
                    isProgrammClear = false;
                    break;
                } else if (scanner.hasNextLine()) // Если пользователь ввёл не число, то проверяем что он ввёл
                {

                    operand1 = scanner.next().charAt(0);

                    if ((operand1 == 's') || (operand1 == 'c')) {
                        if (operand1 == 's') {
                            isProgrammExit = true;
                            break;
                        }
                        if (operand1 == 'c') {
                            isProgrammClear = true;
                            isFinalAction = false;
                            break;
                        }
                    } else System.out.println("You entered incorrect data. Please try again. ");
                }
            }

            //-----------------------------------------------------------------
            while ((isOperationEntered == false) && (isOperand1Entered == true)) // Ввод операции
            {

                System.out.println("Please enter the operation (for clear enter 'c', for exit enter 's') ");
                Scanner scanner = new Scanner(System.in); // Создали объект и указали источник данных
                operation = scanner.next().charAt(0);
                if ((operation == '+') || (operation == '-') || (operation == '*') || (operation == '/')) // Если введена корректная операция, то действуем дальше
                {
                    System.out.println("You entered " + operation);
                    isOperationEntered = true;
                    isFinalAction = true;
                    break;

                } else if (operation == 's' || operation == 'c') // Если введены символы выхода или очистки
                {
                    if (operation == 's') {
                        isProgrammExit = true;
                        break;
                    }

                    if (operation == 'c') {
                        isProgrammClear = true;
                        isFinalAction = false;
                        break;
                    }

                } else {
                    System.out.println("You entered incorrect data. Please try again. ");
                    //System.out.println("To exit the program please enter 'S', to clear result, enter 'C' " );

                }
            }
            //-----------------------------------------------------------------

            while ((isOperand1Entered == true) && (isOperationEntered == true) && (isOperand2Entered == false)) // Ввод операнда 2
            {

                System.out.println("Please enter the second  operand 2 (for clear enter 'c', for exit enter 's')");
                Scanner scanner = new Scanner(System.in); // Создали объект и указали источник данных
                if (scanner.hasNextFloat()) // Если введено вещественное число, то действуем дальше
                {
                    operand2 = scanner.nextFloat();
                    System.out.println("You entered " + operand2);
                    isOperand2Entered = true;
                    isFinalAction = true;
                    break;
                } else if (scanner.hasNextLine()) // Если введено не число, то проверяем, что введено
                {

                    operand2 = scanner.next().charAt(0);

                    if ((operand2 == 's') || (operand2 == 'c')) {
                        if (operand2 == 's') {
                            isProgrammExit = true;
                            break;
                        }
                        if (operand2 == 'c') {
                            isProgrammClear = true;
                            isFinalAction = false;
                            break;
                        }
                    } else System.out.println("You entered incorrect data. Please try again. ");
                }

            }
            //-----------------------------------------------------------------
            if (isProgrammExit) break; // Если был введён символ 'S', то выйдем из основного цикла

            if (isFinalAction) // Если разрешён вывод результата, то действуем
            {
                switch (operation) {
                    case '+':
                        result = add(operand1, operand2);
                        break;

                    case '-':
                        result = sub(operand1, operand2);
                        break;

                    case '*':
                        result = mult(operand1, operand2);
                        break;

                    case '/':
                        result = div(operand1, operand2);
                        break;
                    default:
                        break;

                }

                System.out.println("Result: " + operand1 + " " + operation + " " + operand2 + " = " + result);
            }
            isOperand1Entered = false; // Разрешаем вводить операнды и операцию на следуюбщей итерации
            isOperand2Entered = false;
            isOperationEntered = false;
        }
        System.out.println("You have successfully exited the program ");
    }

    //---------------------------------------------------------------------------------------------------------------
// Методы для математических операций
    public static float add(float operand1, float operand2) {
        return operand1 + operand2;

    }

    public static float sub(float operand1, float operand2) {
        return operand1 - operand2;

    }

    public static float mult(float operand1, float operand2) {
        return operand1 * operand2;

    }

    public static float div(float operand1, float operand2) {
        return operand1 / operand2;

    }


}