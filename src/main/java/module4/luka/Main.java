package module4.luka;

public class Main {
       public static void main(String[] args) {
           String string = "НАЖАЛ КАБАН НА БАКЛАЖАН";
           System.out.println(string);
           System.out.println(reverseString(string));
       }
       public static String reverseString(String string) {
           StringBuilder builder = new StringBuilder(string);
           builder.reverse();
           return builder.toString();
       }
}
