package module4.sakulin33;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String regex = "(<.+?>)|(\\[.+?\\])";
       Pattern pattern = Pattern.compile(regex);
       String text = scanner.nextLine();
       Matcher matcher = pattern.matcher(text);
       String newText = matcher.replaceAll("");
       System.out.println(newText);
   }
}
