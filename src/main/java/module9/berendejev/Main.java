package module9.berendejev;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String date = scanner.nextLine();
        String [] dateList = date.split("/");
        int day = Integer.parseInt(dateList[0]);
        int month = Integer.parseInt(dateList[1]);
        int year = Integer.parseInt(dateList[2]);
        int age;
        System.out.println(calculateAge(day, month, year));
    }

    public static int calculateAge(int day, int month, int year){
        Calendar calendar = Calendar.getInstance();
        int age;
        if (month > calendar.get(Calendar.MONTH) + 1) age = calendar.get(Calendar.YEAR) - year -1;
        else if (month < calendar.get(Calendar.MONTH) + 1) age = calendar.get(Calendar.YEAR) - year;
        else {
            if (day >= calendar.get(Calendar.DAY_OF_MONTH) + 1) age = calendar.get(Calendar.YEAR) - year - 1;
            else age = calendar.get(Calendar.YEAR) - year;
        }
        return age;
    }
}
