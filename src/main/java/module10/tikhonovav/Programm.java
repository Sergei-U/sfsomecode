package module10.tikhonovav;

import java.io.*;
import java.text.SimpleDateFormat;


public class Programm {
    public static void main(String[] args) throws IOException {
        // определяем файлы свойств и резервной копии
        String readFileName = "src/practice10/pr10_6_1final/config/application.properties";
        String saveFileName = "src/practice10/pr10_6_1final/config/application.properties.bak";

        // сделаем проверку доступности файлов и выведем некоторую техническую информацию полезную для администратора
        WorkWithProperties.getFileProperties(readFileName, saveFileName);

        // получаем строки файла в виде массива (списка)
        String lns[];
        lns = WorkWithProperties.getLinesFromFile(readFileName);
        System.out.println("\n\nСодержимое конфигурационнго файла:");
        for (int i = 0; i < lns.length; i++)
            System.out.println(lns[i]);

        // копируем оригинальный конфиг в .bak файл
        WorkWithProperties.createBackupFile(readFileName, saveFileName);

        // выполняем ввод с консоли новых свойств и сохраняем в файл application.properties
        ReadConsole rc = new ReadConsole();
        rc.readConsole(readFileName);
    }
}


class ReadConsole {

    public void readConsole(String readFileName) throws IOException {
        // Считываем строки из консоли и сохраняем их в файл.
        // Объявление экземпляров классов, которые получают данные (строки)
        InputStreamReader sr = new InputStreamReader(System.in); // создать экземпляр InputStreamReader
        BufferedReader br = new BufferedReader(sr); // класс буферизации

        // Объявление экземпляров классов, выводящих строки
        // параметр True включает дозапись в конец файла
        FileOutputStream fos = new FileOutputStream(readFileName, true);
        PrintStream ps = new PrintStream(fos);

        String s;

        // Цикл ввода строк из консоли и запись их в файл
        System.out.println("Введите конфигурационные параметры. Можно вставить строки из буфера обмена.\n" +
                "По окончании нажмите Enter и для выхода введите # Enter:");
        do {
            s = br.readLine(); // считать одну строку
            //System.out.println(s); // вывести эту строку на экран
            ps.println(s); // записать эту строку в поток ps => записать в файл
        } //while (!s.equals("end")); // пока не будет введен символ "#"
        while (!s.equals("#"));
        ps.close();
    }
}


class WorkWithProperties {
    // выведем некоторую техническую информацию относительно файлов application.properties и application.properties.bak
    public static void getFileProperties(String readFileName, String saveFileName) {
        File readfile = new File(readFileName);
        File savefile = new File(saveFileName);

        System.out.println("Имя конфигурационного файла: " + readfile.getName());
        System.out.println("Путь: " + readfile.getPath());
        System.out.println("Полный путь: " +
                readfile.getAbsolutePath());
        System.out.println("Родительский каталог: " +
                readfile.getParent());
        System.out.println(readfile.exists() ?
                "Конфигурационный файл существует" :
                "Конфигурационный файл  не существует");
        System.out.println(savefile.exists() ?
                "Резервная копия файла существует" :
                "Резервная копия файла  не существует");
        System.out.println(readfile.canWrite() ?
                "Конфиг. - можно перезаписывать" :
                "Конфиг. - нельзя записывать");
        System.out.println(readfile.canRead() ?
                "Конфиг. - можно читать" :
                "Конфиг. - нельзя читать");
        System.out.println("Это директория? " +
                (readfile.isDirectory() ?
                        "да" : " нет"));
        System.out.println("Это обычный файл? " +
                (readfile.isFile() ?
                        "да" : "нет"));
        // выведем дату и время в нормальном виде
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Последняя модификация файла : " + sdf.format(readfile.lastModified()));
        System.out.println("Размер файла : " + readfile.length() + " bytes");
    }

    // Получить строки файла в виде массива String[]
    public static String[] getLinesFromFile(String filename) throws IOException {
        // Объявляем внутренние переменные
        int count; // количество строк в файле
        String lines[] = null; // массив строк - результат
        FileReader fr = null;
        String s; // дополнительная переменная - строка
        int symbol;
        int i;

        // 2. Получаем количество строк в файле - вызвать функцию countLinesInFile()
        count = countLinesInFile(filename);

        // 3. Проверка, есть ли в файле строки
        if (count <= 0) return null;

        // 4. Выделить память для count строк
        lines = new String[count];

        // 5. Чтение данных из файла и создание массива lines[]
        try {
            // 5.1. Попытка открыть файл для чтения
            fr = new FileReader(filename);

            // 5.2. Цикл чтения символов из файла и создание массива lines
            s = "";
            i = 0;
            do {
                // Считать символ из файла
                symbol = fr.read();

                // Проверить на символ конца строки
                if (((char) symbol == '\n')) {
                    // удалить из s символ '\n'
                    s = s.substring(0, s.length() - 1);

                    // Добавить в массив строк строку s
                    lines[i] = s;
                    s = "";
                    i++; // Увеличить количество строк в файле на 1
                } else {
                    // добавить символ к строке
                    s = s + (char) symbol;
                }
            } while (fr.ready()); // Проверка на конец файла
        } catch (IOException e) {
            // 5.3. Если файл не открыт, то вывести соответствующее сообщение
            System.out.println("I/O error: " + e);
        } finally {
            // 5.4. Закрыть файл, если он был открыт
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("File close error.");
            }
        }
        // 6. Вернуть результат
        return lines;
    }

    // Вычислить количество строк в файле
    public static int countLinesInFile(String filename) throws IOException {
        // 1. Объявить внутренние переменные
        int count = 0; // количество строк в файле - результат
        FileReader fr = null;
        int symbol;

        try {
            // 2. Попытка открыть файл для чтения
            fr = new FileReader(filename);

            // Цикл чтения символов из файла и подсчета их количества
            do {
                // Считать символ из файла
                symbol = fr.read();

                // Проверить, есть ли символ конца строки
                if ((char) symbol == '\n')
                    count++; // Увеличить количество строк в файле на 1
            } while (fr.ready()); // Проверка на конец файла
        } catch (IOException e) {
            // 3. Если файл не открыт, то вывести соответствующее сообщение
            System.out.println("I/O error: " + e);
        } finally {

            // 4. Закрыть файл, если он был открыт
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("File close error.");
            }
        }
        // 5. Вернуть результат
        System.out.println("В файле");
        return count;
    }

    // создаем файл резервной копии
    public static void createBackupFile(String readFileName, String saveFileName) {
        // скопируем файл при помощи потоков
        // Здесь файл копируется блоками по 1024 байта.
        File readFile = new File(readFileName);
        File writeFile = new File(saveFileName);
        try {
            InputStream fis = new FileInputStream(readFile);
            OutputStream fos = new FileOutputStream(writeFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}