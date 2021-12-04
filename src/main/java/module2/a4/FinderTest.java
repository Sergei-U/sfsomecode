package module2.a4;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FinderTest {
    @Test
    public void test() {
        ByteArrayOutputStream outUser = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outUser));
        Solution solution = new Solution();
        solution.findQuarter(1, 1);
        solution.findQuarter(-1, 4);
        solution.findQuarter(-3, -2);
        solution.findQuarter(5, -3);
        String userOutput = outUser.toString();
        Assert.assertTrue("Solution is incorrect", userOutput.replace("\r", "").replace("\n", "").equals("1234"));
    }
}
