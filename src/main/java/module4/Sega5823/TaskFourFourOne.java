package module4.Sega5823;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFourFourOne {
   public static void main(String[] args) {
       String text = "Сергей 1Рома BeatTheDevil1Tattoo 1Username_Nikolai Sasha-Baron-Koin";
       String[] arrText = checkUsernames(text);
       for (String username : arrText){
           System.out.println(username);
       }
   }
   public static String[] checkUsernames(String text){
       String[] arrText = text.split(" ");
       Pattern pattern = Pattern.compile("[A-ZА-Я][a-zA-zа-яА-я_0-9]{7,19}");
       String[] textOut = new String[arrText.length];
       for (int i = 0; i < arrText.length; i++){
           Matcher matcher = pattern.matcher(arrText[i]);
           if (matcher.matches()) textOut[i] = arrText[i] + " Valid";
           else textOut[i] = arrText[i] + " Invalid";
       }
       return textOut;
   }
}



