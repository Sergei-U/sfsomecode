package module2.yurkov;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);


        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        for (int i = 0; i < o.length(); i++) {
            if (o.charAt(i) == ' ') {
                System.out.println(i);


            }
        }
    }
}