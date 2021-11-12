package module6.a6;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class TestingProgram {
    @Test
    public void starSystemTest() {
        Field[] fields = StarSystem.class.getDeclaredFields();
        Method[] methods = StarSystem.class.getDeclaredMethods();

        Map<String, Boolean> fieldsMap = new HashMap<>();
        Map<String, Boolean> methodsMap = new HashMap<>();

        for (Field field : fields) {
            fieldsMap.put(field.getName(), Modifier.isPrivate(field.getModifiers()));
        }
        for (Method method : methods) {
            methodsMap.put(method.getName(), Modifier.isPrivate(method.getModifiers()));
        }

        boolean check = fieldsMap.containsKey("starName") && fieldsMap.containsKey("quantityOfPlanets") &&
                fieldsMap.containsKey("age") && methodsMap.containsKey("setStarName") &&
                methodsMap.containsKey("setAge") && methodsMap.containsKey("setQuantityOfPlanets") &&
                methodsMap.containsKey("getStarName") && methodsMap.containsKey("getAge") &&
                methodsMap.containsKey("getQuantityOfPlanets") && StarSystem.class.getConstructors().length > 0 &&
                methodsMap.containsKey("getInfo");

        if (check) check = fieldsMap.get("age") && fieldsMap.get("starName") && fieldsMap.get("quantityOfPlanets");

        Assert.assertTrue("StarSystem class is incorrect", check);
    }

    @Test
    public void sunSystemTest() {
        Field[] fields = SunSystem.class.getDeclaredFields();
        Method[] methods = SunSystem.class.getDeclaredMethods();

        Map<String, Boolean> fieldsMap = new HashMap<>();
        Map<String, Boolean> methodsMap = new HashMap<>();

        for (Field field : fields) {
            fieldsMap.put(field.getName(), Modifier.isPrivate(field.getModifiers()));
        }
        for (Method method : methods) {
            methodsMap.put(method.getName(), Modifier.isPrivate(method.getModifiers()));
        }

        boolean check = fieldsMap.containsKey("population") && methodsMap.containsKey("getInfo") &&
                methodsMap.containsKey("setPopulation") && methodsMap.containsKey("getPopulation") &&
                SunSystem.class.getSuperclass().getSimpleName().equals("StarSystem");

        if (check) check = fieldsMap.get("population");

        Assert.assertTrue("SunSystem class is incorrect", check);
    }

    @Test
    public void longTest() {
        Field[] fields = SunSystem.class.getDeclaredFields();
        Map<String, String> fieldsMap = new HashMap<>();
        for (Field field : fields) {
            fieldsMap.put(field.getName(), field.getType().getSimpleName());
        }

        boolean check = fieldsMap.containsKey("population");
        if (check) check = fieldsMap.get("population").equals("long");

        Assert.assertTrue("Population should be long", check);
    }

    @Test
    public void starSystemObjectTest() {
        StarSystem starSystem = new StarSystem("twelfth", 2, 100);
        boolean check = starSystem.getInfo(starSystem.getStarName(), starSystem.getQuantityOfPlanets(), starSystem.getAge()).equals("twelfth 2 100");
        Assert.assertTrue("StarSystem constructor is incorrect", check);
    }

    @Test
    public void sunSystemObjectTest() {
        SunSystem sun = new SunSystem(12, 15, 10000000000L);
        boolean check = sun.getInfo().equals("This is the most densely populated star system in the universe(probably).");
        Assert.assertTrue("getInfo() in SunSystem is incorrect", check);
    }
}
