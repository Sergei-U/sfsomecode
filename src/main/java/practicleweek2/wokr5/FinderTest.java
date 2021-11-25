package practicleweek2.wokr5;

import org.junit.Assert;
import org.junit.Test;

public class FinderTest {
    @Test
    public void humanClassTest() {
        boolean check = Human.class.getConstructors().length == 5;
        Assert.assertTrue("There are not enought constructors or there are to many of them", check);
    }

    @Test
    public void humanObjectTest() {
        boolean check = true;
        Human h = new Human("a", 5);
        Human h2 = new Human("a", "a");
        Human h3 = new Human("a", 5, 4);
        Human h4 = new Human("a", 5, "b");
        Human h5 = new Human(4, 5, "a", "b");

        Human[] arr = new Human[] {h, h2, h3, h4, h5};
        for (Human i : arr) {
            check = check && i.name != null && i.age != 0 && i.weight != 0;
        }

        check = check && h2.address.equals("a") && h4.work.equals("b") && h5.address.equals("a") && h5.work.equals("b");
        Assert.assertTrue("Constructor in Human is incorrect", check);
    }
}
