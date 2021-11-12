package module10.a1.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
   public String getReceipt() throws FileNotFoundException {
       Scanner scanner = new Scanner(new FileInputStream("Root/src/receipt.txt"));
       double result = 0;

       while (scanner.hasNextLine()) {
           String[] productInfo = scanner.nextLine().split(";");
           result += Integer.parseInt(productInfo[1]) * Double.parseDouble(productInfo[2]);
       }

       return String.format(Locale.US, "%.2f", result);
   }
}