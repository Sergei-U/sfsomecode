package encoder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cryptographia {
    public static String encrypt(String text, int shift) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy"); //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        String formattedDateString = localDate.format(formatter);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String lower = upper.toLowerCase();
        String f = formattedDateString+text;
        char[] encrypted = new char[f.length()];
        while (shift < 0) {
            shift += upper.length();
        }
        for (int i = 0; i < f.length(); i++) {
            if ('A' <= f.charAt(i) && f.charAt(i) <= '9') {
                encrypted[i] = upper.charAt((upper.indexOf(f.charAt(i)) + shift) % upper.length());
                //как-то мудрено, пока не понял реализацию шифра в деталях. Почему так много вложенных скобок?
            } else if ('a' <= f.charAt(i) && f.charAt(i) <= '9') {
                encrypted[i] = lower.charAt((lower.indexOf(f.charAt(i)) + shift) % lower.length());
            } else {
                encrypted[i] = f.charAt(i);
            }
        }
        return String.valueOf(encrypted); //зачем возвращаем новую строку если должны возвращать encrypted  из цикла?
    }

    public String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }
}