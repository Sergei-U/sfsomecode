package main.java.module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {


//        String text = "aba aba a!a abba adca abea";
        String text = "abba adca abea";
        Pattern pattern = Pattern.compile("a..a");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
