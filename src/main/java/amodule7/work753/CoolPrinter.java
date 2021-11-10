package main.java.amodule7.work753;

import java.util.ArrayList;


public class CoolPrinter {
    public static String testString = "";
    private static ArrayList<String> lines = new ArrayList<String>();
    public static void add(String line){    //при помощи данного метода мы можем загрузить строки. Данный метод добавляет в память принтера переданную строку line.
        lines.add(line);
    }
    public static void print(Formatter formatter){  //переданная в метод add строка печатается красиво при помощи статического метода, который принимает объект класса, реализующего интерфейс Formatter
        if (!testString.equals(""))
            System.out.println(testString);
        if (formatter == null){
            print();
            return;
        }
        for (String line : lines){
            System.out.println(formatter.format(line));
        }
        if (!formatter.getClass().isAnonymousClass()) {
            System.out.println("BUT FORMATTER'S CLASS IS NOT ANONYMOUS...");
        }
    }
    public static void clear(){
        lines.clear();
    }
    public static void print(){
        System.out.println("No Formatter - no print!");
    }

}