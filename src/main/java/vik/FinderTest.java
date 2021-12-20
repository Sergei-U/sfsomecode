package vik;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FinderTest {
    @Test
    public void bellTest() {
        ByteArrayOutputStream outUser = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outUser));
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        String userOutput = outUser.toString();
        Assert.assertTrue("Bell is incorrect", userOutput.replace("\r", "").replace("\n", "").equals("dingdongdingdong"));
    }
}
