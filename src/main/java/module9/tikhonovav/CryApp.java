package module9.tikhonovav;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.List;

public class CryApp {
   static String fileIn = "src/utilsencrypt2/message.txt";
   static String fileOut = "src/utilsencrypt2/encrypt.txt";

   public static void main(String[] args) throws IOException {
       CryApp app = new CryApp();
       Time tm = new Time();

       // 1. прочитаем текстовый файл сообщения
       System.out.println("Читаем текст сообщения из файла <--");
       List<String> listMsg = Files.readAllLines(Path.of(fileIn), StandardCharsets.UTF_8);

       // 2. добавим метку времени
       System.out.println("Добавляем метку времени [--]");
       listMsg.add(tm.insertTime());
       System.out.println(listMsg);

       // 3. зашифруем
       // listMsg.replaceAll();
       System.out.println("Шифруем [--]");
       for (int i = 0; i < listMsg.size(); i++) {
           //listMsg.get(i).replaceAll("а", "я");
           //System.out.println(listMsg.get(i).replaceAll("а", "я"));
           // кириллица
           String sstr = listMsg.get(i).replaceAll("а", "ɓ");
           sstr = sstr.replaceAll("б", "ɑ");
           sstr = sstr.replaceAll("в", "ɕ");
           sstr = sstr.replaceAll("г", "ɨ");
           sstr = sstr.replaceAll("д", "ɧ");
           sstr = sstr.replaceAll("е", "ɯ");
           sstr = sstr.replaceAll("ж", "ɮ");
           sstr = sstr.replaceAll("з", "ώ");
           sstr = sstr.replaceAll("и", "ύ");
           sstr = sstr.replaceAll("к", "ɜ");
           sstr = sstr.replaceAll("л", "ό");
           sstr = sstr.replaceAll("м", "ϋ");
           sstr = sstr.replaceAll("н", "ɫ");
           sstr = sstr.replaceAll("о", "ω");
           sstr = sstr.replaceAll("п", "υ");
           sstr = sstr.replaceAll("р", "σ");
           sstr = sstr.replaceAll("с", "ρ");
           sstr = sstr.replaceAll("т", "ς");
           sstr = sstr.replaceAll("у", "ɦ");
           sstr = sstr.replaceAll("ф", "ɢ");
           sstr = sstr.replaceAll("х", "ɩ");
           sstr = sstr.replaceAll("ц", "ɞ");
           sstr = sstr.replaceAll("ч", "ɛ");
           sstr = sstr.replaceAll("ш", "ɝ");
           sstr = sstr.replaceAll("ю", "ɚ");
           sstr = sstr.replaceAll("я", "ɟ");
           // латиница
           sstr = sstr.replaceAll("a", "ΰ");
           sstr = sstr.replaceAll("b", "α");
           sstr = sstr.replaceAll("c", "β");
           sstr = sstr.replaceAll("d", "γ");
           sstr = sstr.replaceAll("e", "δ");
           sstr = sstr.replaceAll("f", "ε");
           sstr = sstr.replaceAll("g", "ζ");
           sstr = sstr.replaceAll("h", "η");
           sstr = sstr.replaceAll("i", "θ");
           sstr = sstr.replaceAll("j", "ι");
           sstr = sstr.replaceAll("k", "ξ");
           sstr = sstr.replaceAll("l", "λ");
           sstr = sstr.replaceAll("m", "μ");
           sstr = sstr.replaceAll("n", "ν");
           sstr = sstr.replaceAll("o", "ɐ");
           sstr = sstr.replaceAll("p", "ɠ");
           sstr = sstr.replaceAll("q", "ɡ");
           sstr = sstr.replaceAll("r", "ɣ");
           sstr = sstr.replaceAll("s", "τ");
           sstr = sstr.replaceAll("t", "ɬ");
           sstr = sstr.replaceAll("u", "φ");
           sstr = sstr.replaceAll("v", "ɤ");
           sstr = sstr.replaceAll("x", "ϊ");
           sstr = sstr.replaceAll("y", "ɥ");
           sstr = sstr.replaceAll("z", "ɔ");
           // цифры
           sstr = sstr.replaceAll("0", "ĳ");
           sstr = sstr.replaceAll("1", "ȝ");
           sstr = sstr.replaceAll("2", "œ");
           sstr = sstr.replaceAll("3", "ŉ");
           sstr = sstr.replaceAll("4", "Ĵ");
           sstr = sstr.replaceAll("5", "ƈ");
           sstr = sstr.replaceAll("6", "ͻ");
           sstr = sstr.replaceAll("7", "ͽ");
           sstr = sstr.replaceAll("8", "Œ");
           sstr = sstr.replaceAll("9", "ʁ");
           // символы
           sstr = sstr.replaceAll("\\+", "Ⱥ");
           sstr = sstr.replaceAll("-", "Ⱦ");
           sstr = sstr.replaceAll("=", "ɇ");
           sstr = sstr.replaceAll(":", "ɍ");
           sstr = sstr.replaceAll(" ", "ͤͥ");

           listMsg.set(i, sstr);
       }

       // 4. сохраним зашифрованное сообщение в отдельный текстовый файл
       System.out.print("Сохраняем зашифрованное сообщение в файл -->");
       FileWriter writer = new FileWriter(fileOut);
       for (String strMod : listMsg) {
           writer.write(strMod + System.lineSeparator());
       }
       writer.close();
       System.out.println(" OK!");

       // 5. прочитаем зашифрованный текстовый файл
       System.out.println("Читаем зашифрованное сообщение из файла <--");
       List<String> listEncryptMsg = Files.readAllLines(Path.of(fileOut), StandardCharsets.UTF_8);
       System.out.println(listEncryptMsg);

       // 6. почитаем зашифрованный текстовый файл и выведем на консоль расшифрованное сообщение
       System.out.println("Расшифровываем текст сообщения [--]");
       List<String> listCryptMsg = Files.readAllLines(Path.of(fileOut), StandardCharsets.UTF_8);
       for (int y = 0; y < listCryptMsg.size(); y++) {
           //listMsg.get(i).replaceAll("а", "я");
           //System.out.println(listMsg.get(i).replaceAll("а", "я"));
           // кириллица
           String ustr = listCryptMsg.get(y).replaceAll("ɓ", "а");
           ustr = ustr.replaceAll("ɑ", "б");
           ustr = ustr.replaceAll("ɕ", "в");
           ustr = ustr.replaceAll("ɨ", "г");
           ustr = ustr.replaceAll("ɧ", "д");
           ustr = ustr.replaceAll("ɯ", "е");
           ustr = ustr.replaceAll("ɮ", "ж");
           ustr = ustr.replaceAll("ώ", "з");
           ustr = ustr.replaceAll("ύ", "и");
           ustr = ustr.replaceAll("ɜ", "к");
           ustr = ustr.replaceAll("ό", "л");
           ustr = ustr.replaceAll("ϋ", "м");
           ustr = ustr.replaceAll("ɫ", "н");
           ustr = ustr.replaceAll("ω", "о");
           ustr = ustr.replaceAll("υ", "п");
           ustr = ustr.replaceAll("σ", "р");
           ustr = ustr.replaceAll("ρ", "с");
           ustr = ustr.replaceAll("ς", "т");
           ustr = ustr.replaceAll("ɦ", "у");
           ustr = ustr.replaceAll("ɢ", "ф");
           ustr = ustr.replaceAll("ɩ", "х");
           ustr = ustr.replaceAll("ɞ", "ц");
           ustr = ustr.replaceAll("ɛ", "ч");
           ustr = ustr.replaceAll("ɝ", "ш");
           ustr = ustr.replaceAll("ɚ", "ю");
           ustr = ustr.replaceAll("ɟ", "я");
           // латиница
           ustr = ustr.replaceAll("ΰ", "a");
           ustr = ustr.replaceAll("α", "b");
           ustr = ustr.replaceAll("β", "c");
           ustr = ustr.replaceAll("γ", "d");
           ustr = ustr.replaceAll("δ", "e");
           ustr = ustr.replaceAll("ε", "f");
           ustr = ustr.replaceAll("ζ", "g");
           ustr = ustr.replaceAll("η", "h");
           ustr = ustr.replaceAll("θ", "i");
           ustr = ustr.replaceAll("ι", "j");
           ustr = ustr.replaceAll("ξ", "k");
           ustr = ustr.replaceAll("λ", "l");
           ustr = ustr.replaceAll("μ", "m");
           ustr = ustr.replaceAll("ν", "n");
           ustr = ustr.replaceAll("ɐ", "o");
           ustr = ustr.replaceAll("ɠ", "p");
           ustr = ustr.replaceAll("ɡ", "q");
           ustr = ustr.replaceAll("ɣ", "r");
           ustr = ustr.replaceAll("τ", "s");
           ustr = ustr.replaceAll("ɬ", "t");
           ustr = ustr.replaceAll("φ", "u");
           ustr = ustr.replaceAll("ɤ", "v");
           ustr = ustr.replaceAll("ϊ", "x");
           ustr = ustr.replaceAll("ɥ", "y");
           ustr = ustr.replaceAll("ɔ", "z");
           // цифры
           ustr = ustr.replaceAll("ĳ", "0");
           ustr = ustr.replaceAll("ȝ", "1");
           ustr = ustr.replaceAll("œ", "2");
           ustr = ustr.replaceAll("ŉ", "3");
           ustr = ustr.replaceAll("Ĵ", "4");
           ustr = ustr.replaceAll("ƈ", "5");
           ustr = ustr.replaceAll("ͻ", "6");
           ustr = ustr.replaceAll("ͽ", "7");
           ustr = ustr.replaceAll("Œ", "8");
           ustr = ustr.replaceAll("ʁ", "9");
           // символы
           ustr = ustr.replaceAll("Ⱥ", "\\+");
           ustr = ustr.replaceAll("Ⱦ", "-");
           ustr = ustr.replaceAll("ɇ", "=");
           ustr = ustr.replaceAll("ɍ", ":");
           ustr = ustr.replaceAll("ͤͥ", " ");

           listCryptMsg.set(y, ustr);
       }
       //System.out.println(listCryptMsg + System.lineSeparator());
       // распечатаем нормально
       //System.out.println(Arrays.toString(listCryptMsg.toArray()));
       listCryptMsg.forEach(System.out::println);
   }
}



class Time {
   public String insertTime() {
       Calendar calendar = Calendar.getInstance();
       calendar.getTime();
       //System.out.println("------- Временная метка: " + calendar.getTime() + " --------");
       return "+------ Временная метка: " + calendar.getTime() + " -------+";
   }
}
