package module9.doppewe7;

import java.io.*;
import java.util.Scanner;

public class Solution {
        public void dance() throws IOException {
            Scanner scanner = new Scanner(new FileInputStream("Root/src/dance.txt"));
            StringBuilder result = new StringBuilder();
            int rhythm = Integer.parseInt(scanner.nextLine()); // read rhythm
            while (scanner.hasNextLine()) {
                int step = Integer.parseInt(scanner.nextLine());
                result.append(step / rhythm).append(" ").append(step % rhythm).append("\n"); // add in result string
            }

            // write result in file
            FileWriter writer = new FileWriter(new File("Root/src/rhythm.txt"), false);
            writer.write(result.toString().trim()); // trim result because \n in the end
            writer.flush();
        }
    }

class Solution2 {
    public void dance() throws IOException {
        int linesCount=0;
        int smb = 0;
        File f = new File("Root/src/dance.txt");
        File f1 = new File("Root/src/rhythm.txt");
        FileOutputStream out = new FileOutputStream(f1);
        FileInputStream in = new FileInputStream(f);
        Scanner scanner = new Scanner(in);
        int count = Integer.parseInt(scanner.nextLine());
        while (scanner.hasNext()) {
            linesCount = scanner.nextInt();
            if(smb!=0){
                out.write("\r\n".getBytes());
            }
            if(linesCount%count==0){
                out.write(Integer.toString(linesCount/count).getBytes());
                out.write("0".getBytes());
                smb++;
            } else {
                out.write(Integer.toString(linesCount/count).getBytes());
                out.write(" ".getBytes());
                out.write(Integer.toString(linesCount%count).getBytes());
                smb++;
            }
        }
    }
}

