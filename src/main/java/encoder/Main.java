package encoder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        String text = "asadsasdasdasdasda";
        Cryptographia c = new Cryptographia();
        System.out.println("Внимание, сейчас мы зашифруем текст!");
        System.out.println(c.encrypt(text, -2));
        System.out.println("А теперь мы вернем его обратно, как был: ");
        System.out.println(c.decrypt(text, 1));

    }
}