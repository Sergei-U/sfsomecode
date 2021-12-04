package module2.а6;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SubTest {
    @Test
    public void test() {
        ByteArrayOutputStream outUser = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outUser));

        Solution solution = new Solution();
        solution.numbers(1, 1, 1);
        solution.numbers(0, 1, 1);
        solution.numbers(-1, -1, -1);
        solution.numbers(0, 0, 0);
        solution.numbers(1, 0, -1);


        String userOutput = outUser.toString();
        Assert.assertTrue("Solution is incorrect",
                userOutput.
                        replace("\r", "").
                        replace("\n", "").
                        equals("3 positive, 0 negative, 0 equal 02 positive, 0 negative, 1 equal 00 positive, 3 negative, 0 equal 00 positive, 0 negative, 3 equal 01 positive, 1 negative, 1 equal 0"));
    }
}
