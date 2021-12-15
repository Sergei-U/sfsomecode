package module4.uita;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputPassword {
    private String password;

    public InputPassword(String password) {
        this.password = password; //конструктор для одинаковых имен переменных;
    }

    boolean checkPassword() {  // проверка условий пароля;
        Pattern checkOfRightInput = Pattern.compile("([a-zA-z]+){2}\\d{4}"); // регулярное выражение для пароля;
        Matcher matcher = checkOfRightInput.matcher(password);
        if (matcher.matches()) { // условие совпадения пароля с регулярным выражением;
            System.out.println("Correct password");
            return true;
        } else {
            System.out.println("Incorrect password");
            return false;
        }
    }
    public void setPassword(String inputPassword) {
        password = inputPassword;
    } //сеттер для ввода пароля;
}
