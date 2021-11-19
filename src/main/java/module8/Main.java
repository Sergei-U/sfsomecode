package module8;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        double d = 6;
        String s = "sdasdasdasd";
        File f = new File("c:/");
        File[] files = f.listFiles();
        int count = files.length;
        System.out.println(count);
        System.out.println(s.length());
        System.out.println(Math.abs(d));
    }
}
