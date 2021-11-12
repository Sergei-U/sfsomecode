package main.java;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

    }

    private static void binarySearch(int[] sortArr, int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int position = (end + start) / 2;
        int result = sortArr[position];
        int step = 1;
        boolean stopButton = false;
        do {
            System.out.println(position);
            System.out.println(result);
            System.out.printf("Шаг: %d\n", step);
            System.out.printf("Загаданное число: %d?\n", result);
            System.out.println("3- Верно, я загадал это число!");
            System.out.println("2- Нет, загаданное число больше.");
            System.out.println("1- Нет, загаданное число меньше.");
            System.out.println("0- Выход.");
            int input = scanner.nextInt();
            switch (input) {
                case 3:
                    System.out.printf("Отлично! Загаданное число: %d\n", result);
                    stopButton = true;
                    break;
                case 2:
                    start = position + 1;
                    break;
                case 1:
                    end = position - 1;
                    break;
                case 0:
                    stopButton = true;
                    break;
                default:
                    System.out.println("Команда не поддерживается.");
                    break;
            }
            step++;
            position = (end + start) / 2; //<-- Вопрос по этой строке и следующей. Без них код не работает.
            result = sortArr[position];
        } while ((!stopButton) && (start <= end));
        if (start > end) {
            System.out.println("Диапазон нарушен, первый элемент больше последнего.");
        }
    }
}
