package module1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name ="";
        int s =0;
        if(scanner.hasNextLine()) {
        name= scanner.nextLine();}
        else if (scanner.hasNextInt()){
        s = scanner.nextInt();}

        System.out.println("string name:" +name);
        System.out.println("int s:" +s);
    }
}
