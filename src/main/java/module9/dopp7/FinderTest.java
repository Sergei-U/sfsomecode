package module9.dopp7;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinderTest {
    @Test
    public void test() throws IOException {
        String text = "4\n" +
                "24\n" +
                "15\n" +
                "9\n" +
                "98";
        String result = "6 0\n" +
                "3 3\n" +
                "2 1\n" +
                "24 2";

        boolean answer = fileTest(text, result);
        Assert.assertTrue("Your answer is incorrect", answer);
    }

    @Test
    public void test2() throws IOException {
        String text = "3\n" +
                "14\n" +
                "28\n" +
                "9";
        String result = "4 2\n" +
                "9 1\n" +
                "3 0";

        boolean answer = fileTest(text, result);
        Assert.assertTrue("Your answer is incorrect", answer);
    }

    private boolean fileTest(String text, String result) throws IOException {
        String path = "Root/src/dance.txt";
        String path2 = "Root/src/rhythm.txt";

        FileWriter writer = new FileWriter(new File(path), false);
        writer.write(text);
        writer.flush();

        new Solution().dance();
        String userResult = new String(Files.readAllBytes(Paths.get(path2)));

        writer = new FileWriter(new File(path), false);
        writer.write("You can write here anything you want for the test of your program before passing");
        writer.flush();

        return result.equals(userResult);
    }
}
