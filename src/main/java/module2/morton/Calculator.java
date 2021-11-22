package module2.morton;

import java.util.Scanner;

public class Calculator {
   static int operand1;    //первое число в работе калькулятора
   static int operand2;    //второе число в работе калькулятора
   static char action;     // действие, которое мы будем делать с введенными числами
   static int result;      // собственно, результат работы программы

   public static void main(String[] args) {
       System.out.println("Добро пожаловать в программу КАЛЬКУЛЯТОР");
       System.out.println("Введите первое число");
       Scanner scanner = new Scanner(System.in);
       operand1 = scanner.nextInt();
       System.out.println("Можно выполнить сложение, вычитание, умножение или деление. Что будем делать?");
       action = scanner.next().charAt(0);
       if (action == '+' || action == '-' || action == '*' || action == '/') {
           System.out.println("Теперь введите второе число");
           operand2 = scanner.nextInt();
           calculator(operand1, operand2, action);
       } else {
           System.out.println("Операция не поддерживается калькулятором");
       }
   }

   public static void calculator(int operand1, int operand2, char action) {
       switch (action) {
           case '+':
               result = operand1 + operand2;
               System.out.println("Результат суммы " + result);
               break;
           case '-':
               result = operand1 - operand2;
               System.out.println("Результат вычитания " + result);
               break;
           case '*':
               result = operand1 * operand2;
               System.out.println("Результат умножения " + result);
               break;
           case '/':
               result = operand1 / operand2;
               System.out.println("Результат деления " + result);
               break;
           default:
       }
   }
}

