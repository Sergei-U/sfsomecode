package module9.dopp7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution3 {
   public int getCountWords() throws FileNotFoundException {
       Scanner scanner = new Scanner(new FileInputStream("Root/src/text.txt"));
       int countWords = 0;

       while (scanner.hasNextLine()) {
           String[] words = scanner.nextLine().split(" ");
           countWords += words.length;
       }

       return countWords;
   }
}