package module2.Julia2021;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calc {


    public static void Calculator() {

        int operand1, operand2;
        BigDecimal res; // BigDecimal объект для хранения результата
        int newScale = 3; // Шкала для BigDecimal: до какого знака после запятой округлять
        int temp = 0; //Выбор пункта меню при запуске программы
        double radians = 0;
        char end1 = 's';
        char end2 = 'S';


        Scanner sc = new Scanner(System.in);

        System.out.println("Калькулятор");
        metka:
        while (true) {
            System.out.print("\nЕсли хотите посчитать синус, то нажмите (1)\n" +
                    "Если хотите выполнить арифметические операции, то нажмите (2)\n" +
                    "Для завершения работы программы нажмите (3)\n");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
            } else {
                System.out.print("\nОшибка выбора пункта меню\n");
            }
            if (temp == 1) {
                System.out.print("\nВведите градусы: ");
                if (sc.hasNextDouble()) {
                    radians = sc.nextDouble();

                    double test = Math.sin(Math.toRadians(radians));

                    BigDecimal a = new BigDecimal(test);

                    try {

                        // Использование метода setScale ()
                        // Использование RoundingMode.CEILING

                        res = a.setScale(newScale, RoundingMode.CEILING);

                        // Показать результат в BigDecimal (вывод числа с округлением)

                        System.out.println("Синус равен: " + res + "\n");

                    } catch (Exception e) {

                        // Распечатать исключение2


                        System.out.println("Выход" + e);

                    }
                } else {
                    System.out.print("Ошибка ввода");
                    break;
                }
            }
            if (temp == 2) {


                System.out.print("Введите первый операнд: ");

                Scanner scanner = new Scanner(System.in);
                operand1 = scanner.nextInt(); //считывает число 1
                //System.out.println("Вы ввели число 1 =  " + operand1);

                System.out.print("Введите второй операнд: ");
                operand2 = scanner.nextInt(); //считывает число 2
                //System.out.println("Вы ввели число 2 =  " + operand2);


/*Метод next() класса Scanner считывает строку,
а метод charAt(0) позволяет взять первый символ в этой строке.
 так мы получаем операцию, которую нужно выполнить*/

                metka2:
                System.out.print("Введите необходимую операцию (возможны +, -, *, / ), s - выход из программы, C - переход в главное меню ");
                char operation = scanner.next().charAt(0);
                //System.out.println("Выбрана операция " + operation);

                int rez;

                if ((operand2 == 0) && (operation == '/')) {
                    System.out.println("Недопустимая операция: деление на 0 ");
                }
                if ((operation == 'C') || (operation == 'c')) {
                    continue metka;
                }
                if ((operation == end1) || (operation == end2)) {
                    //scanner.close();
                    System.out.println("Завершение работы программы");
                    break;
                } else {

                    switch (operation) {

                        case '+':
                            rez = operand1 + operand2;
                            System.out.println(" = " + rez);
                            break;

                        case '-':
                            rez = operand1 - operand2;
                            System.out.println("Результат операции " + rez);

                            break;

                        case '*':
                            rez = operand1 * operand2;
                            System.out.println("Результат операции " + rez);
                            break;

                        case '/':
                            rez = operand1 / operand2;
                            System.out.println("Результат операции " + rez);
                            break;

                        default:
                            System.out.println("Извините, некорректная операция. Перезапустите программу и попробуйте снова!");
                    }
                }

            }

            if (temp == 3) {
                break;
            }

        }
    }
}









