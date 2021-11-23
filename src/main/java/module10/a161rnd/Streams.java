package module10.a161rnd;

import java.io.*;

public class Streams {


         public static void main(String[] args) throws Exception {
            streamsDemo();
        }

        public static void streamsDemo() throws Exception {

            FileInputStream fis = new FileInputStream("testRW1");
             
               Reader rd = new InputStreamReader(fis, "utf8");  
             
             
               BufferedReader br = new BufferedReader(rd);

            String line = br.readLine();  
             
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            rd.close();
            fis.close();

        }

}


