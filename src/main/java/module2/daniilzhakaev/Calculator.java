package module2.daniilzhakaev;

//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        double num1;
//        double num2;
//        double ans;
//        char op;
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//        num1 = reader.nextDouble();
//        num2 = reader.nextDouble();
//        System.out.print("\nEnter an operator (+, -, *, /): ");
//        op = reader.next().charAt(0);
//        switch (op) {
//            case '+' : ans = num1 + num2;
//            case '-' : ans = num1 - num2;
//            case '*' : ans = num1 * num2;
//            case '/' : ans = num1 / num2;
//            default : {
//                System.out.print("Error! Enter correct operator");
//                return;
//            }
//        }
//    }
//}

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
            }
        }
        return result;
    }
}