package module9.t922;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/main/java/module9/t922/files/answer.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            System.out.println(stringBuilder.append(scanner.nextLine()));

        }

    }
}