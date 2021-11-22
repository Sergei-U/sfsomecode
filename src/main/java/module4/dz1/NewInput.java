package module4.dz1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NewInput {
   public static void main(String[] args) {
       Person user1 = new Person("mylogin", "88005553535", "mypassword1234");
       System.out.println("Логин: " + user1.getLogin());
       System.out.println("Номер: " + user1.getNumber());
       System.out.println("Пароль: " + user1.getPassword());
       Pattern p = Pattern.compile("\\d{5,}");
       Matcher matcher = p.matcher(user1.getPassword());
       System.out.println(matcher.find() ? "В пароле более 5 чисел" : "В пароле менее 5 чисел");
   }
}

class Person {
   private String login;
   private String password;
   private String number;
   public Person(String login, String number, String password) {
       this.login = login;
       this.number = number;
       this.password = password;
   }
   public String getLogin() {
       return login;
   }
   public void setLogin(String login) {
       this.login = login;
   }
   public String getNumber() {
       StringBuilder sb = new StringBuilder(number);
       sb.replace(0,8,"********");
       number = sb.toString();
       return number;
   }
   public void setNumber(String number) {
       this.number = number;
   }
   public String getPassword() {
       return password;
   }
   public void setPassword(String password) {
       this.password = password;
   }
}
