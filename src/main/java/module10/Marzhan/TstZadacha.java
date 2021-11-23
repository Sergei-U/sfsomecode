package module10.Marzhan;

import java.io.*;

public class TstZadacha {
   public static void main(String[] args) throws IOException {
       String pushkin = "Я помню чудное мгновенье:\n" +
               "Передо мной явилась ты,\n" +
               "Как мимолетное виденье,\n" +
               "Как гений чистой красоты.\n";

       try (FileWriter writer = new FileWriter("test.txt")) {
           writer.write(pushkin);
           System.out.println("Done!");
       } catch (IOException ioException) {
           ioException.printStackTrace();
       }
   }
}


class TstZadacha2 {
   public static void main(String[] args) throws IOException {
       try (
               BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
               BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"));
       ) {
           int c;
           while ((c = reader.read()) != -1) {
               writer.write((char) c);
           }
           System.out.println("Done");
       }
   }
}

