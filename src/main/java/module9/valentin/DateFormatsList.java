package module9.valentin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatsList {
    public static void main(String[] args) throws IOException {
        boolean isCreated;

        File dir = new File("D:\\Users\\nelVehzeR\\Documents\\DateFormatList");
        File file = new File("D:\\Users\\nelVehzeR\\Documents\\DateFormatList", "list.txt");

        isCreated = dir.mkdir();
        if (isCreated == true) {
            System.out.println("Создана директория: " + dir.getAbsolutePath());
        }

        isCreated = file.createNewFile();
        if (isCreated == true) {
            System.out.println("Создан файл: " + file.getName());
        }

        Calendar calendar = Calendar.getInstance();

        String[] formats = new String[6];

        formats[0] = "dd MMMM yyyy HH:mm:ss";
        formats[1] = "yyyy.MM.dd G 'at' HH:mm:ss z";
        formats[2] = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        formats[3] = "YYYY-'W'ww-u";
        formats[4] = "K:mm a, z";
        formats[5] = "EEE, MMM d, ''yy";

        FileWriter fw = new FileWriter(file);

        for (int i = 0; i < formats.length; i++) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(formats[i]);
            fw.write(dateFormat.format(calendar.getTime()) + "\n");
        }

        fw.close();
    }
}