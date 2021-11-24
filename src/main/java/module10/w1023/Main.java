package module10.w1023;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "src/main/java/module10/w1023/files/asciitable.txt";
        FileInputStream files = new FileInputStream(path);
        int count = 0;
        int c;
        while ((c = files.read()) != -1) {
            if (c >= '0' && c <= '9')
                count++;
        }

        System.out.println(count);
        files.close();


        List<String> f = Files.readAllLines(Path.of(path), StandardCharsets.UTF_8);
        char[] chars = f.toString().toCharArray();
        int counts=0;
        for(char i: chars)
            if (i >= '0' && i <= '9') counts++;
        System.out.println(counts);
    }
}
