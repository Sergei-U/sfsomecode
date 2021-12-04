package module3.afaf;

public class Main {
    public static void main(String[] args) {
        String a = "котлета";
        System.out.println("Из " + a.length() + " букв можно составить:");
        System.out.print (a.charAt(3));
        System.out.print (a.charAt(4));
        System.out.print (a.charAt(5));
        System.out.println (a.charAt(1));
        System.out.print (a.charAt(2));
        System.out.print (a.charAt(1));
        System.out.println (a.charAt(0));
        System.out.println(a.substring(0,3));
    }
}