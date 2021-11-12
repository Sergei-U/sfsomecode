package module6.a5;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class TestingProgram {
    @Test
    public void studentTest() {
        Field[] fields = Student.class.getDeclaredFields();
        Field[] fields1 = Person.class.getDeclaredFields();
        Method[] methods = Student.class.getDeclaredMethods();
        List<String> fieldsNames = new ArrayList<>();
        List<String> methodNames = new ArrayList<>();

        for (Field field : fields) {
            fieldsNames.add(field.getName());
        }
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
        for (Field field : fields1) {
            fieldsNames.add(field.getName());
        }

        boolean check = fieldsNames.contains("name") && fieldsNames.contains("age") && fieldsNames.contains("grade") &&
                methodNames.contains("giveGrade") && methodNames.contains("praise") &&
                Student.class.getSuperclass().getSimpleName().equals("Person");

        Assert.assertTrue("Student class is incorrect", check);
    }
}
