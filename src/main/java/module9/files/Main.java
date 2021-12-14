package module9.files;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int i;
        String fileName = ".\\files\\answer.txt";
        File f = new File(fileName);
        if (f.exists()) {
            System.out.println("File " + fileName + " exists!");
            FileInputStream fis = new FileInputStream(fileName);
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
            System.out.println();
        } else {
            System.out.println("File " + fileName + " DOESN'T exists!");
        }
    }
}