package eka;

public class Main {

    //переменные класса
    private static int i = 2;
    private static int a = 3;


    public static void main(String[] args) {

        //переменные метода
        int b = 6;
        int c = 8;

        System.out.println("Переменные класса i:" + i + "a" + a);
        System.out.println("Переменные метода b:" + b + "c" + c);
        int resultClass = i + a;
        System.out.println(resultClass);
        int resultMethod = b + c;
        System.out.println(resultMethod);
    }
}
