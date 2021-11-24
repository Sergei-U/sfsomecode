package module9.dopp7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Solution {
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
