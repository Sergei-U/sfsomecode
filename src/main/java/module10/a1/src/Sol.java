package module10.a1.src;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Sol {
    public String getReceipt() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/receipt.txt"));
//        BufferedReader reader = new BufferedReader(new FileReader("Root/src/receipt.txt"));
        double sum = 0;
//        String line = reader.readLine();
        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().split(";");
            int count = Integer.parseInt(words[1]);
            double price = Double.parseDouble(words[2]);
            sum += count*price;
        }
        return String.format(Locale.US,"%.2f", sum);
    }
}
