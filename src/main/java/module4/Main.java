package module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Иван Петров";
        Pattern pattern = Pattern.compile("(.*) (.*)");
        Matcher matcher = pattern.matcher(text);
//меняем первую группу со второй
        System.out.println(matcher.replaceFirst("$2 $1"));
    }
}
