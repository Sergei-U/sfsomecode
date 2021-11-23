package module10.valentin;

import java.io.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("source.txt");
        File res = new File("res.txt");
        boolean isCreated = source.exists();

        String txt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum iaculis eleifend sapien, ut cursus nisl pulvinar sed.\n" +
                "Vivamus non metus ipsum. Quisque hendrerit dapibus laoreet. Maecenas pellentesque sagittis dolor, id pulvinar tellus\n" +
                "vulputate in. Sed tellus ante, auctor vitae metus sed, convallis consectetur mi. Nullam dui nulla, sodales sed maximus nec,\n" +
                "varius vitae leo. Donec pharetra massa eget condimentum sollicitudin. Phasellus nisl quam, molestie non felis pharetra,\n" +
                "consectetur bibendum arcu. Aenean volutpat nisl a lectus scelerisque pellentesque. Mauris iaculis condimentum nisl, non\n" +
                "luctus nunc tincidunt faucibus. In volutpat ligula vitae molestie bibendum. Aliquam venenatis mollis ex, ut vestibulum\n" +
                "enim bibendum at. Nullam faucibus nisi vitae quam mattis volutpat. Nam eget ipsum pharetra, dignissim enim sit amet,\n" +
                "euismod quam.";

        if (isCreated != true) {
            isCreated = source.createNewFile();
        }
        OutputStream sourceFill = new FileOutputStream(source);

        if (isCreated == true) {
            sourceFill.write(txt.getBytes());
        }

        sourceFill.close();

        StringBuffer sb = new StringBuffer();
        String lmFormat = "dd MMMM yyyy HH:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(lmFormat);

        sb.append("Файл: " + source.getAbsolutePath() + "\n" +
                "Изменен: " + dateFormat.format(source.lastModified()) + "\n" +
                "Содержание: "
        );

        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(res);

        int i;
        while ((i = fis.read()) != -1) {
            sb.append((char) i);
        }

        isCreated = res.exists();

        if (isCreated == true) {
            fos.write(sb.toString().getBytes());
        }

        fis.close();
        fos.close();

        source.delete();
    }
}