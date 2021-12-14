package practicleweek.w7;

import org.junit.Assert;
import org.junit.Test;

public class FinderTest {
    @Test
    public void limitingTest() {
        LimitingRectangle r = new LimitingRectangle(new int[][]{{-1, -2}, {3, 4}});
        String res = r.getWidth() + "" + r.getHeight() + "";
        res += r.getBorders();
        LimitingRectangle r2 = new LimitingRectangle(new int[][]{{-11, -12}, {13, -14}, {-15, 10}});
        res += r2.getWidth() + "" + r2.getHeight() + "" + r2.getBorders();
        Assert.assertTrue("Some methods is incorrect", res.equals("46-2, 4, -1, 32824-14, 10, -15, 13"));
    }
}
