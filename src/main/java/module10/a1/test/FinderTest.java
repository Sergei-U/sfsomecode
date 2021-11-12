package module10.a1.test;

import module10.a1.src.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinderTest {
    @Test
    public void test() throws IOException {
//        String path = "Root/src/receipt.txt";
        String path = "src/main/java/module10/a1/src/Receipt.txt";
        FileWriter writer = new FileWriter(new File(path), false);
        writer.write("Crab sticks;10;30.00\n" +
                "Cips;2;54.90\n" +
                "Apple;1;45.90\n" +
                "Pineapple;2;50.00\n" +
                "Meat;1;495.70");
        writer.flush();

        String result = new Solution().getReceipt();

        writer = new FileWriter(new File(path), false);
        writer.write("You can write here anything you want for the test of your program before passing");
        writer.flush();

        Assert.assertTrue("Your answer is: " + result + ", correct answer: 1051.40", result.equals("1051.40"));

    }
}